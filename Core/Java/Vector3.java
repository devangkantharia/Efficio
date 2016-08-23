/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Runtime;

public class Vector3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Vector3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Vector3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioRuntimeJNI.delete_Vector3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Vector3(float x, float y, float z) {
    this(EfficioRuntimeJNI.new_Vector3(x, y, z), true);
  }

  public float X() {
    return EfficioRuntimeJNI.Vector3_X(swigCPtr, this);
  }

  public float Y() {
    return EfficioRuntimeJNI.Vector3_Y(swigCPtr, this);
  }

  public float Z() {
    return EfficioRuntimeJNI.Vector3_Z(swigCPtr, this);
  }

}
