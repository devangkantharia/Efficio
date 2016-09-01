/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public final class FingerName {
  public final static FingerName Thumb = new FingerName("Thumb");
  public final static FingerName Index = new FingerName("Index");
  public final static FingerName Middle = new FingerName("Middle");
  public final static FingerName Ring = new FingerName("Ring");
  public final static FingerName Pinky = new FingerName("Pinky");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FingerName swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FingerName.class + " with value " + swigValue);
  }

  private FingerName(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FingerName(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FingerName(String swigName, FingerName swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FingerName[] swigValues = { Thumb, Index, Middle, Ring, Pinky };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

