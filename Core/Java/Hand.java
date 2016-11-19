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

  public Hand(SWIGTYPE_p_BodySide side, SWIGTYPE_p_arrayT_Efficio__Models__Body__Finger_5_t fingers) {
    this(EfficioJNI.new_Hand(SWIGTYPE_p_BodySide.getCPtr(side), SWIGTYPE_p_arrayT_Efficio__Models__Body__Finger_5_t.getCPtr(fingers)), true);
  }

  public SWIGTYPE_p_BodySide getSide() {
    return new SWIGTYPE_p_BodySide(EfficioJNI.Hand_Side_get(swigCPtr, this), true);
  }

  public SWIGTYPE_p_arrayT_Efficio__Models__Body__Finger_5_t getFingers() {
    return new SWIGTYPE_p_arrayT_Efficio__Models__Body__Finger_5_t(EfficioJNI.Hand_Fingers_get(swigCPtr, this), true);
  }

}
