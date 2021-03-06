#include "Gesture.h"

namespace Efficio {

	namespace InputRecognition {
		Gesture::Gesture(std::string source): Event(source)
		{
		}

		Gesture::~Gesture()
		{
		}

		std::time_t Gesture::GetStartTime()
		{
			return startTime;
		}

		std::time_t Gesture::GetGestureDuration()
		{
			return difftime(time(NULL), startTime);
		}
	}
}