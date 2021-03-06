#include "Finger.h"

namespace Efficio
{
	namespace Models
	{
		namespace Body
		{
			Finger::Finger() : Valid(false), IsExtended(false), Length(-1), FingerType(FingerType::Unknown)
			{
			}
			Finger::Finger(Efficio::Models::Body::FingerType fingerType, bool isExtended, float length, Joint tip, Joint dip, Joint mcp, Joint pip)
				: FingerType(fingerType), IsExtended(isExtended), Length(length), Tip(tip), DIP(dip), MCP(mcp), PIP(pip), Valid(true)
			{
			}
			Finger::~Finger()
			{
			}
		}
	}
}