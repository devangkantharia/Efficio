#pragma once

#if COMPILING_DLL
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT __declspec(dllimport)
#endif

namespace Efficio
{
	namespace Body {

		extern enum class DLLEXPORT BodyTrackingType
		{
			Eye,
			Face,
			Hand,
			Arm,
			Body
		};
	}

	extern enum DLLEXPORT GestureType {
		Discrete,
		Continuous
	};

	extern enum DLLEXPORT GestureState {
		InProgress,
		Completed
	};
}
