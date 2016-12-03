/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class EventCollection {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected EventCollection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EventCollection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioJNI.delete_EventCollection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public EventCollection() {
    this(EfficioJNI.new_EventCollection__SWIG_0(), true);
  }

  public EventCollection(long n) {
    this(EfficioJNI.new_EventCollection__SWIG_1(n), true);
  }

  public long size() {
    return EfficioJNI.EventCollection_size(swigCPtr, this);
  }

  public long capacity() {
    return EfficioJNI.EventCollection_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    EfficioJNI.EventCollection_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return EfficioJNI.EventCollection_isEmpty(swigCPtr, this);
  }

  public void clear() {
    EfficioJNI.EventCollection_clear(swigCPtr, this);
  }

  public void add(Event x) {
    EfficioJNI.EventCollection_add(swigCPtr, this, Event.getCPtr(x), x);
  }

  public Event get(int i) {
    long cPtr = EfficioJNI.EventCollection_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Event(cPtr, true);
  }

  public void set(int i, Event val) {
    EfficioJNI.EventCollection_set(swigCPtr, this, i, Event.getCPtr(val), val);
  }

}