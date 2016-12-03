#pragma once

#if COMPILING_DLL
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT __declspec(dllimport)
#endif


namespace Efficio
{
	namespace Configuration
	{
		/// Configuration for the Leap Motion device
		extern class DLLEXPORT LeapConfiguration
		{
		public:
			LeapConfiguration();
			~LeapConfiguration();
			bool Enabled;
		};
	}
}