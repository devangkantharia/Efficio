#include "Engine.h"
#if WINDOWS
#include "LeapMotion.h"
#include "RealSense.h"
#endif
//#include "Kinect.h"
#include "GearVR.h"

// Events
#include "EfficioStarted.h"

namespace Efficio {
	Engine::Engine() : started(false), frameID(1)
	{
#if WINDOWS
		sensors.push_back(new Sensors::RealSense(Efficio::Sensors::TrackingType::Hand));
		sensors.push_back(new Sensors::Body::LeapMotion());
#endif
		//sensors.push_back(new Sensors::Body::Kinect());
		//sensors.push_back(new Sensors::GearVR());
	}

	Engine::~Engine()
	{
	}

	Frame Engine::Start()
	{
		std::shared_ptr<Frame> startFrame(new Frame(NULL, frameID++));

		startFrame->AddEvent(std::shared_ptr<Events::Event>(new Events::Internal::EfficioStarted()));

		// TODO execute OnStart actions

		// Connect to all sensors
		for (size_t i = 0; i < sensors.size(); i++)
		{
			startFrame->AddFrame(sensors[i]->Connect());
		}

		historicalFrames.AddFrame(startFrame);

		return *startFrame;
	}

	std::shared_ptr<Efficio::Frame> Engine::GetFrame()
	{
		std::shared_ptr<Efficio::Frame> frame(new Efficio::Frame(GetFrame(1), frameID++));
		deltaTimeSum += frame->DeltaTime;

		// TODO execute BeforeDeviceQuery actions

		// Query sensors for frames
		for (size_t i = 0; i < sensors.size(); i++)
		{
			frame->AddFrame(sensors[i]->GetFrame());
		}

		// TODO execute AfterDeviceQuery actions

		// TODO execute BeforeFrameProcess actions

		auto detectedEvents = ire.ProcessFrame(frame);
		frame->AddEvents(detectedEvents);

		// TODO execute AfterFrameProcess actions

		// Save frame
		if (historicalFrames.historicalFrames.at(59) != NULL)
		{
			deltaTimeSum -= GetFrame(60)->DeltaTime;
		}
		historicalFrames.AddFrame(frame);

		return frame;
	}


	std::shared_ptr<Efficio::Frame> Engine::GetFrame(int count)
	{
		auto tempFrame = historicalFrames.GetFrame(count);

		if (tempFrame)
		{
			return historicalFrames.GetFrame(count);
		}

		return NULL;
	}

	float Engine::GetFrameRate()
	{
		return  60 / (deltaTimeSum / 1000);
	}

}