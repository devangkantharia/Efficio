/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class Engine {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Engine(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Engine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioRuntimeJNI.delete_Engine(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Engine() {
    this(EfficioRuntimeJNI.new_Engine(), true);
  }

  public Frame Start() {
    return new Frame(EfficioRuntimeJNI.Engine_Start(swigCPtr, this), true);
  }

  public Frame GetFrame() {
    long cPtr = EfficioRuntimeJNI.Engine_GetFrame__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new Frame(cPtr, true);
  }

  public Frame GetFrame(int count) {
    long cPtr = EfficioRuntimeJNI.Engine_GetFrame__SWIG_1(swigCPtr, this, count);
    return (cPtr == 0) ? null : new Frame(cPtr, true);
  }

  public float GetFrameRate() {
    return EfficioRuntimeJNI.Engine_GetFrameRate(swigCPtr, this);
  }

}
