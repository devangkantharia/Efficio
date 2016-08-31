/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class Device {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Device(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Device obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioJNI.delete_Device(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setID(String value) {
    EfficioJNI.Device_ID_set(swigCPtr, this, value);
  }

  public String getID() {
    return EfficioJNI.Device_ID_get(swigCPtr, this);
  }

  public void setPosition(Vector3 value) {
    EfficioJNI.Device_Position_set(swigCPtr, this, Vector3.getCPtr(value), value);
  }

  public Vector3 getPosition() {
    long cPtr = EfficioJNI.Device_Position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Vector3(cPtr, false);
  }

  public void setDirection(Vector3 value) {
    EfficioJNI.Device_Direction_set(swigCPtr, this, Vector3.getCPtr(value), value);
  }

  public Vector3 getDirection() {
    long cPtr = EfficioJNI.Device_Direction_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Vector3(cPtr, false);
  }

  public void setEnabled(boolean value) {
    EfficioJNI.Device_Enabled_set(swigCPtr, this, value);
  }

  public boolean getEnabled() {
    return EfficioJNI.Device_Enabled_get(swigCPtr, this);
  }

  public boolean Connected() {
    return EfficioJNI.Device_Connected(swigCPtr, this);
  }

  public DeviceStatus Status() {
    return DeviceStatus.swigToEnum(EfficioJNI.Device_Status(swigCPtr, this));
  }

  public TrackingType TrackingTypes() {
    return TrackingType.swigToEnum(EfficioJNI.Device_TrackingTypes(swigCPtr, this));
  }

  public void Connect() {
    EfficioJNI.Device_Connect(swigCPtr, this);
  }

  public void Disconnect() {
    EfficioJNI.Device_Disconnect(swigCPtr, this);
  }

  public boolean HasFrame() {
    return EfficioJNI.Device_HasFrame(swigCPtr, this);
  }

  public SWIGTYPE_p_Leap__Frame GetFrame() {
    return new SWIGTYPE_p_Leap__Frame(EfficioJNI.Device_GetFrame(swigCPtr, this), true);
  }

}
