/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio;

public class Disonnecting extends SensorEvent {
  private transient long swigCPtr;

  protected Disonnecting(long cPtr, boolean cMemoryOwn) {
    super(EfficioRuntimeJNI.Disonnecting_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Disonnecting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioRuntimeJNI.delete_Disonnecting(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Disonnecting(SensorInformation details) {
    this(EfficioRuntimeJNI.new_Disonnecting(SensorInformation.getCPtr(details), details), true);
  }

  public EventType GetEventType() {
    return EventType.swigToEnum(EfficioRuntimeJNI.Disonnecting_GetEventType(swigCPtr, this));
  }

}
