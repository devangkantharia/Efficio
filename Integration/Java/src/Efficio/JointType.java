/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio;

public final class JointType {
  public final static JointType None = new JointType("None");
  public final static JointType Head = new JointType("Head");
  public final static JointType ShoulderCenter = new JointType("ShoulderCenter");
  public final static JointType ShoulderRight = new JointType("ShoulderRight");
  public final static JointType ElbowRight = new JointType("ElbowRight");
  public final static JointType WristRight = new JointType("WristRight");
  public final static JointType HandRight = new JointType("HandRight");
  public final static JointType ShoulderLeft = new JointType("ShoulderLeft");
  public final static JointType ElbowLeft = new JointType("ElbowLeft");
  public final static JointType WristLeft = new JointType("WristLeft");
  public final static JointType HandLeft = new JointType("HandLeft");
  public final static JointType Spine = new JointType("Spine");
  public final static JointType HipCenter = new JointType("HipCenter");
  public final static JointType HipRight = new JointType("HipRight");
  public final static JointType KneeRight = new JointType("KneeRight");
  public final static JointType AnkleRight = new JointType("AnkleRight");
  public final static JointType FootRight = new JointType("FootRight");
  public final static JointType HipLeft = new JointType("HipLeft");
  public final static JointType KneeLeft = new JointType("KneeLeft");
  public final static JointType AnkleLeft = new JointType("AnkleLeft");
  public final static JointType FootLeft = new JointType("FootLeft");
  public final static JointType RightHandThumbIP = new JointType("RightHandThumbIP");
  public final static JointType RightHandThumbMCP = new JointType("RightHandThumbMCP");
  public final static JointType RightHandThumbCMP = new JointType("RightHandThumbCMP");
  public final static JointType RightHandThumbTIP = new JointType("RightHandThumbTIP");
  public final static JointType RightHandIndexMCP = new JointType("RightHandIndexMCP");
  public final static JointType RightHandIndexPIP = new JointType("RightHandIndexPIP");
  public final static JointType RightHandIndexDIP = new JointType("RightHandIndexDIP");
  public final static JointType RightHandIndexTIP = new JointType("RightHandIndexTIP");
  public final static JointType RightHandMiddleMCP = new JointType("RightHandMiddleMCP");
  public final static JointType RightHandMiddlePIP = new JointType("RightHandMiddlePIP");
  public final static JointType RightHandMiddleDIP = new JointType("RightHandMiddleDIP");
  public final static JointType RightHandMiddleTIP = new JointType("RightHandMiddleTIP");
  public final static JointType RightHandRingMCP = new JointType("RightHandRingMCP");
  public final static JointType RightHandRingPIP = new JointType("RightHandRingPIP");
  public final static JointType RightHandRingDIP = new JointType("RightHandRingDIP");
  public final static JointType RightHandRingTIP = new JointType("RightHandRingTIP");
  public final static JointType RightHandPinkyMCP = new JointType("RightHandPinkyMCP");
  public final static JointType RightHandPinkyPIP = new JointType("RightHandPinkyPIP");
  public final static JointType RightHandPinkyDIP = new JointType("RightHandPinkyDIP");
  public final static JointType RightHandPinkyTIP = new JointType("RightHandPinkyTIP");
  public final static JointType LeftHandThumbIP = new JointType("LeftHandThumbIP");
  public final static JointType LeftHandThumbMCP = new JointType("LeftHandThumbMCP");
  public final static JointType LeftHandThumbCMP = new JointType("LeftHandThumbCMP");
  public final static JointType LeftHandThumbTIP = new JointType("LeftHandThumbTIP");
  public final static JointType LeftHandIndexMCP = new JointType("LeftHandIndexMCP");
  public final static JointType LeftHandIndexPIP = new JointType("LeftHandIndexPIP");
  public final static JointType LeftHandIndexDIP = new JointType("LeftHandIndexDIP");
  public final static JointType LeftHandIndexTIP = new JointType("LeftHandIndexTIP");
  public final static JointType LeftHandMiddleMCP = new JointType("LeftHandMiddleMCP");
  public final static JointType LeftHandMiddlePIP = new JointType("LeftHandMiddlePIP");
  public final static JointType LeftHandMiddleDIP = new JointType("LeftHandMiddleDIP");
  public final static JointType LeftHandMiddleTIP = new JointType("LeftHandMiddleTIP");
  public final static JointType LeftHandRingMCP = new JointType("LeftHandRingMCP");
  public final static JointType LeftHandRingPIP = new JointType("LeftHandRingPIP");
  public final static JointType LeftHandRingDIP = new JointType("LeftHandRingDIP");
  public final static JointType LeftHandRingTIP = new JointType("LeftHandRingTIP");
  public final static JointType LeftHandPinkyMCP = new JointType("LeftHandPinkyMCP");
  public final static JointType LeftHandPinkyPIP = new JointType("LeftHandPinkyPIP");
  public final static JointType LeftHandPinkyDIP = new JointType("LeftHandPinkyDIP");
  public final static JointType LeftHandPinkyTIP = new JointType("LeftHandPinkyTIP");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static JointType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + JointType.class + " with value " + swigValue);
  }

  private JointType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private JointType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private JointType(String swigName, JointType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static JointType[] swigValues = { None, Head, ShoulderCenter, ShoulderRight, ElbowRight, WristRight, HandRight, ShoulderLeft, ElbowLeft, WristLeft, HandLeft, Spine, HipCenter, HipRight, KneeRight, AnkleRight, FootRight, HipLeft, KneeLeft, AnkleLeft, FootLeft, RightHandThumbIP, RightHandThumbMCP, RightHandThumbCMP, RightHandThumbTIP, RightHandIndexMCP, RightHandIndexPIP, RightHandIndexDIP, RightHandIndexTIP, RightHandMiddleMCP, RightHandMiddlePIP, RightHandMiddleDIP, RightHandMiddleTIP, RightHandRingMCP, RightHandRingPIP, RightHandRingDIP, RightHandRingTIP, RightHandPinkyMCP, RightHandPinkyPIP, RightHandPinkyDIP, RightHandPinkyTIP, LeftHandThumbIP, LeftHandThumbMCP, LeftHandThumbCMP, LeftHandThumbTIP, LeftHandIndexMCP, LeftHandIndexPIP, LeftHandIndexDIP, LeftHandIndexTIP, LeftHandMiddleMCP, LeftHandMiddlePIP, LeftHandMiddleDIP, LeftHandMiddleTIP, LeftHandRingMCP, LeftHandRingPIP, LeftHandRingDIP, LeftHandRingTIP, LeftHandPinkyMCP, LeftHandPinkyPIP, LeftHandPinkyDIP, LeftHandPinkyTIP };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
