#pragma once

#if WINDOWS
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
	namespace Models
	{
		namespace Body
		{
			/// The different finger types
			enum class DLLEXPORT FingerType {
				Unknown,
				Thumb,
				Index,
				Middle,
				Ring,
				Pinky
			};
		}
	}
}