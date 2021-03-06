/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio;

public class HandData extends Data {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected HandData(long cPtr, boolean cMemoryOwn) {
    super(EfficioRuntimeJNI.HandData_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HandData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        EfficioRuntimeJNI.delete_HandData(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HandData() {
    this(EfficioRuntimeJNI.new_HandData__SWIG_0(), true);
  }

  public HandData(HandCollection hands) {
    this(EfficioRuntimeJNI.new_HandData__SWIG_1(HandCollection.getCPtr(hands), hands), true);
  }

  public void setHands(HandCollection value) {
    EfficioRuntimeJNI.HandData_Hands_set(swigCPtr, this, HandCollection.getCPtr(value), value);
  }

  public HandCollection getHands() {
    long cPtr = EfficioRuntimeJNI.HandData_Hands_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HandCollection(cPtr, false);
  }

  public DataType GetDataType() {
    return DataType.swigToEnum(EfficioRuntimeJNI.HandData_GetDataType(swigCPtr, this));
  }

}
