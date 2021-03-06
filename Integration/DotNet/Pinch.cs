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

public class Pinch : DiscreteGesture {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal Pinch(global::System.IntPtr cPtr, bool cMemoryOwn) : base(EfficioRuntimePINVOKE.Pinch_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Pinch obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~Pinch() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          EfficioRuntimePINVOKE.delete_Pinch(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public Pinch(string source, BodySide side, Finger finger1, Finger finger2, int handID) : this(EfficioRuntimePINVOKE.new_Pinch(source, (int)side, Finger.getCPtr(finger1), Finger.getCPtr(finger2), handID), true) {
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public Vector3 Position {
    set {
      EfficioRuntimePINVOKE.Pinch_Position_set(swigCPtr, Vector3.getCPtr(value));
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      global::System.IntPtr cPtr = EfficioRuntimePINVOKE.Pinch_Position_get(swigCPtr);
      Vector3 ret = (cPtr == global::System.IntPtr.Zero) ? null : new Vector3(cPtr, false);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public Finger Finger1 {
    set {
      EfficioRuntimePINVOKE.Pinch_Finger1_set(swigCPtr, Finger.getCPtr(value));
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      global::System.IntPtr cPtr = EfficioRuntimePINVOKE.Pinch_Finger1_get(swigCPtr);
      Finger ret = (cPtr == global::System.IntPtr.Zero) ? null : new Finger(cPtr, false);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public Finger Finger2 {
    set {
      EfficioRuntimePINVOKE.Pinch_Finger2_set(swigCPtr, Finger.getCPtr(value));
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      global::System.IntPtr cPtr = EfficioRuntimePINVOKE.Pinch_Finger2_get(swigCPtr);
      Finger ret = (cPtr == global::System.IntPtr.Zero) ? null : new Finger(cPtr, false);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public override EventType GetEventType() {
    EventType ret = (EventType)EfficioRuntimePINVOKE.Pinch_GetEventType(swigCPtr);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public BodySide Side {
    set {
      EfficioRuntimePINVOKE.Pinch_Side_set(swigCPtr, (int)value);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      BodySide ret = (BodySide)EfficioRuntimePINVOKE.Pinch_Side_get(swigCPtr);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public int HandID {
    set {
      EfficioRuntimePINVOKE.Pinch_HandID_set(swigCPtr, value);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      int ret = EfficioRuntimePINVOKE.Pinch_HandID_get(swigCPtr);
      if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

}

}
