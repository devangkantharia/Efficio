#pragma once

#include <map>
#include "Vector3.h"
#include "Joint.h"

#if COMPILING_DLL
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT __declspec(dllimport)
#endif

namespace Efficio
{
	namespace Models
	{
		namespace Human
		{

			extern enum class FingerName {
				Thumb,
				Index,
				Middle,
				Ring,
				Pinky
			};

			extern class DLLEXPORT Finger
			{
			public:
				Finger();
				Finger(FingerName fingerName, std::map<std::string, Efficio::Vector3> jointPositions);
				~Finger();
				Efficio::Vector3 GetJointPosition(std::string jointName);
				FingerName Name;
			private:
				std::map<std::string, Efficio::Vector3> jointPositions;
			};
		}
	}
}