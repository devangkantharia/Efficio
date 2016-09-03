#include "Engine.h"
#include <iostream>
#include "Enumerations.h"
#include "Vector3.h"
#include "PinchDetector.h"
#include "LeapMotionDevice.h"

namespace Efficio {
	Engine::Engine() : started(false), frameID(1)
	{
	}

	Engine::~Engine()
	{

	}

	void Engine::Start()
	{
		if (DeviceConfiguration.LeapConfiguration.Enabled)
		{
			auto leapMotion = std::shared_ptr<Efficio::Device>(new Efficio::LeapMotionDevice());
			DeviceManager.AddDevice(leapMotion);
		}

		for (size_t i = 0; i < DeviceManager.GetDevices().size(); i++)
		{
			DeviceManager.GetDevices()[i]->Connect();
		}

		started = true;
	}

	std::shared_ptr<Efficio::EfficioFrame> Engine::GetFrame()
	{
		std::shared_ptr<Efficio::EfficioFrame> efficioFrame(new EfficioFrame(frameID++));

		if (started)
		{
			auto connectedDevices = DeviceManager.GetDevicesWithStatus(Efficio::DeviceStatus::Connected);
			for (size_t i = 0; i < connectedDevices.size(); i++)
			{
				auto device = connectedDevices[i];

				if (device->HasFrame())
				{
					auto frame = device->GetFrame();

					auto hands = frame.HandData.Hands;

					if (hands.size() > 0)
					{
						for (size_t i = 0; i < hands.size(); i++)
						{
							Efficio::InputRecognition::Human::Hands::PinchDetector detector;
							detector.Enabled = true;
							auto pinches = detector.Detect(hands[i]);

							for (size_t j = 0; j < pinches.size(); j++)
							{
								efficioFrame->AddEvent(pinches[j]);
							}

							efficioFrame->AddHand(std::shared_ptr<Efficio::Models::Human::Hand>(&hands[i]));
						}
					}
				}
			}
		}

		historicalFrames.AddFrame(efficioFrame);
		return efficioFrame;
	}

	std::shared_ptr<Efficio::EfficioFrame> Engine::GetFrame(int count)
	{
		auto tempFrame = historicalFrames.GetFrame(count);

		if (tempFrame)
		{
			return historicalFrames.GetFrame(count);
		}

		return NULL;
	}
}