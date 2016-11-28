/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class Hand {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Hand(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Hand obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioJNI.delete_Hand(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Hand(BodySide side, FingerCollection fingers, float confidence) {
    this(EfficioJNI.new_Hand__SWIG_0(side.swigValue(), FingerCollection.getCPtr(fingers), fingers, confidence), true);
  }

  public Hand(BodySide side, FingerCollection fingers) {
    this(EfficioJNI.new_Hand__SWIG_1(side.swigValue(), FingerCollection.getCPtr(fingers), fingers), true);
  }

  public void setSide(BodySide value) {
    EfficioJNI.Hand_Side_set(swigCPtr, this, value.swigValue());
  }

  public BodySide getSide() {
    return BodySide.swigToEnum(EfficioJNI.Hand_Side_get(swigCPtr, this));
  }

  public void setConfidence(float value) {
    EfficioJNI.Hand_Confidence_set(swigCPtr, this, value);
  }

  public float getConfidence() {
    return EfficioJNI.Hand_Confidence_get(swigCPtr, this);
  }

  public void setFingers(FingerCollection value) {
    EfficioJNI.Hand_Fingers_set(swigCPtr, this, FingerCollection.getCPtr(value), value);
  }

  public FingerCollection getFingers() {
    long cPtr = EfficioJNI.Hand_Fingers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FingerCollection(cPtr, false);
  }

}
