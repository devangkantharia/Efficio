#pragma once

#include "Gesture.h"

#if _WINDLL
#if COMPILING_DLL
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT __declspec(dllimport)
#endif
#else
#define DLLEXPORT
#endif

namespace Efficio 
{
	namespace InputRecognition
	{
		/// Continuous gestures are gestures that are done over time
		extern class DLLEXPORT ContinuousGesture : public Gesture
		{
		public:
			ContinuousGesture();
			~ContinuousGesture();
			GestureType GetType() { return GestureType::Continuous; };
			virtual GestureState GetGestureState() = 0;
		};
	}
}