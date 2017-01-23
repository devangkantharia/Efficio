//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.10
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace Efficio.Net {

public class Hand : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal Hand(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Hand obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~Hand() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioRuntimePINVOKE.delete_Hand(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public Hand() : this(EfficioRuntimePINVOKE.new_Hand__SWIG_0(), true) {
  }

  public Hand(BodySide side, FingerCollection fingers, float confidence) : this(EfficioRuntimePINVOKE.new_Hand__SWIG_1((int)side, FingerCollection.getCPtr(fingers), confidence), true) {
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public Hand(BodySide side, FingerCollection fingers) : this(EfficioRuntimePINVOKE.new_Hand__SWIG_2((int)side, FingerCollection.getCPtr(fingers)), true) {
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public BodySide Side {
    set {
      EfficioRuntimePINVOKE.Hand_Side_set(swigCPtr, (int)value);
    } 
    get {
      BodySide ret = (BodySide)EfficioRuntimePINVOKE.Hand_Side_get(swigCPtr);
      return ret;
    } 
  }

  public float Confidence {
    set {
      EfficioRuntimePINVOKE.Hand_Confidence_set(swigCPtr, value);
    } 
    get {
      float ret = EfficioRuntimePINVOKE.Hand_Confidence_get(swigCPtr);
      return ret;
    } 
  }

  public bool IsSupine() {
    bool ret = EfficioRuntimePINVOKE.Hand_IsSupine(swigCPtr);
    return ret;
  }

  public float SupinationAngle {
    set {
      EfficioRuntimePINVOKE.Hand_SupinationAngle_set(swigCPtr, value);
    } 
    get {
      float ret = EfficioRuntimePINVOKE.Hand_SupinationAngle_get(swigCPtr);
      return ret;
    } 
  }

  public uint ID {
    set {
      EfficioRuntimePINVOKE.Hand_ID_set(swigCPtr, value);
    } 
    get {
      uint ret = EfficioRuntimePINVOKE.Hand_ID_get(swigCPtr);
      return ret;
    } 
  }

  public string Source {
    set {
      EfficioRuntimePINVOKE.Hand_Source_set(swigCPtr, value);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      string ret = EfficioRuntimePINVOKE.Hand_Source_get(swigCPtr);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public FingerCollection Fingers {
    set {
      EfficioRuntimePINVOKE.Hand_Fingers_set(swigCPtr, FingerCollection.getCPtr(value));
    } 
    get {
      global::System.IntPtr cPtr = EfficioRuntimePINVOKE.Hand_Fingers_get(swigCPtr);
      FingerCollection ret = (cPtr == global::System.IntPtr.Zero) ? null : new FingerCollection(cPtr, false);
      return ret;
    } 
  }

}

}
