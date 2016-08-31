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
        EfficioJNI.delete_Engine(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Engine() {
    this(EfficioJNI.new_Engine(), true);
  }

  public void Start() {
    EfficioJNI.Engine_Start(swigCPtr, this);
  }

  public EfficioFrame GetFrame() {
    long cPtr = EfficioJNI.Engine_GetFrame__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new EfficioFrame(cPtr, true);
  }

  public EfficioFrame GetFrame(int count) {
    long cPtr = EfficioJNI.Engine_GetFrame__SWIG_1(swigCPtr, this, count);
    return (cPtr == 0) ? null : new EfficioFrame(cPtr, true);
  }

  public void setDeviceConfiguration(DeviceConfiguration value) {
    EfficioJNI.Engine_DeviceConfiguration_set(swigCPtr, this, DeviceConfiguration.getCPtr(value), value);
  }

  public DeviceConfiguration getDeviceConfiguration() {
    long cPtr = EfficioJNI.Engine_DeviceConfiguration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DeviceConfiguration(cPtr, false);
  }

  public void setDeviceManager(DeviceManager value) {
    EfficioJNI.Engine_DeviceManager_set(swigCPtr, this, DeviceManager.getCPtr(value), value);
  }

  public DeviceManager getDeviceManager() {
    long cPtr = EfficioJNI.Engine_DeviceManager_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DeviceManager(cPtr, false);
  }

}
