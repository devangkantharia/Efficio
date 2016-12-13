#pragma once


#if COMPILING_DLL
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT __declspec(dllimport)
#endif

namespace Efficio
{
	namespace Events
	{
		extern enum class DLLEXPORT EventType
		{
			EfficioStarted,
			SensorConnecting,
			SensorConnected,
			SensorDisconnecting,
			SensorDisconnected,
			SensorFaulted,
			Pinch,
			ButtonPressed
		};
	}
}