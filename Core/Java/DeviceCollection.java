/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class DeviceCollection {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DeviceCollection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DeviceCollection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioJNI.delete_DeviceCollection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DeviceCollection() {
    this(EfficioJNI.new_DeviceCollection__SWIG_0(), true);
  }

  public DeviceCollection(long n) {
    this(EfficioJNI.new_DeviceCollection__SWIG_1(n), true);
  }

  public long size() {
    return EfficioJNI.DeviceCollection_size(swigCPtr, this);
  }

  public long capacity() {
    return EfficioJNI.DeviceCollection_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    EfficioJNI.DeviceCollection_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return EfficioJNI.DeviceCollection_isEmpty(swigCPtr, this);
  }

  public void clear() {
    EfficioJNI.DeviceCollection_clear(swigCPtr, this);
  }

  public void add(Device x) {
    EfficioJNI.DeviceCollection_add(swigCPtr, this, Device.getCPtr(x), x);
  }

  public Device get(int i) {
    long cPtr = EfficioJNI.DeviceCollection_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Device(cPtr, true);
  }

  public void set(int i, Device val) {
    EfficioJNI.DeviceCollection_set(swigCPtr, this, i, Device.getCPtr(val), val);
  }

}