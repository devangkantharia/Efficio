/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio;

public class FaceData extends Data {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected FaceData(long cPtr, boolean cMemoryOwn) {
    super(EfficioRuntimeJNI.FaceData_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FaceData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        EfficioRuntimeJNI.delete_FaceData(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FaceData() {
    this(EfficioRuntimeJNI.new_FaceData(), true);
  }

  public DataType GetDataType() {
    return DataType.swigToEnum(EfficioRuntimeJNI.FaceData_GetDataType(swigCPtr, this));
  }

}
