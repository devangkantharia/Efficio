#pragma once

#include <string>
#include "Data.h"

#if WINDOWS
#if COMPILING_DLL
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT __declspec(dllimport)
#endif
# else
#define DLLEXPORT 
#endif

namespace Efficio
{
	namespace Data
	{
		namespace Positional 
		{
			/// <summary>
			/// Class representing elevation.
			/// </summary>
			/// <seealso cref="Efficio::Data::Data" />
			class DLLEXPORT Altitude : public Data
			{
			public:
				/// <summary>
				/// Initializes a new instance of the <see cref="Altitude"/> class.
				/// </summary>
				/// <param name="altitude">The altitude.</param>
				/// <param name="unit">The unit of measurement.</param>
				Altitude(float altitude, std::string unit = "meters") : Measure(altitude), Unit(unit) {};

				/// <summary>
				/// Finalizes an instance of the <see cref="Altitude"/> class.
				/// </summary>
				~Altitude() {};


				/// <summary>
				/// Gets the altitude. This measurement is unitless.
				/// </summary>
				float Measure;


				/// <summary>
				/// Units of measurement
				/// </summary>
				std::string Unit;

				/// <summary>
				/// Gets the type of the data.
				/// </summary>
				/// <returns></returns>
				Efficio::Data::DataType GetDataType() { return Efficio::Data::DataType::Altitude; }
			private:
			};
		}
	}
}