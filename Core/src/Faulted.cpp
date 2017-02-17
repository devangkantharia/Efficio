#include "Faulted.h"

namespace Efficio
{
	namespace Sensors
	{
		Faulted::Faulted(Sensors::SensorInformation details) : SensorInformation(details)
		{
		}

		Faulted::~Faulted()
		{
		}

		Events::EventType Efficio::Sensors::Faulted::GetEventType()
		{
			return Events::EventType::SensorFaulted;
		}
	}
}
