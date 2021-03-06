/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio;

public final class DataType {
  public final static DataType None = new DataType("None");
  public final static DataType Altitude = new DataType("Altitude");
  public final static DataType Location = new DataType("Location");
  public final static DataType Hand = new DataType("Hand");
  public final static DataType Face = new DataType("Face");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static DataType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + DataType.class + " with value " + swigValue);
  }

  private DataType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private DataType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private DataType(String swigName, DataType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static DataType[] swigValues = { None, Altitude, Location, Hand, Face };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

