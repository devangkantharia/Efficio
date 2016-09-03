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
				//Finger(FingerName fingerName, std::map<Efficio::Models::Human::JointName, Efficio::Vector3> jointPositions);
				Finger(FingerName fingerName, std::vector<Efficio::Models::Human::Joint> joints);
				~Finger();
				Efficio::Vector3 GetJointPosition(Efficio::Models::Human::JointName jointName);
				FingerName Name;
				std::string GetFingerNameString();
				std::string GetJointNameString(Efficio::Models::Human::JointName jointName);
			private:
				std::vector<Efficio::Models::Human::Joint> Joints;
				//std::map<Efficio::Models::Human::JointName, Efficio::Vector3> jointPositions;
			};
		}
	}
}