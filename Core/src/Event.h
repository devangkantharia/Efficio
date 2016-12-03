#pragma once

#include "EventType.h"

#include <time.h>

#if COMPILING_DLL
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT __declspec(dllimport)
#endif

namespace Efficio 
{
	namespace Events 
	{
		/// The abstract class for all events within the Efficio system. Events are raised when anything notable happens within the Efficio ecosystem.
		extern class DLLEXPORT Event
		{
		public:
			Event();
			~Event();

			time_t Time;

			size_t ID;

			virtual Efficio::Events::EventType GetEventType() = 0;

		protected:
			static size_t Event::IdIndex;
		};
	}
}