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
          EfficioPINVOKE.delete_Hand(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public Hand(SWIGTYPE_p_BodySide side, SWIGTYPE_p_arrayT_Efficio__Models__Body__Finger_5_t fingers) : this(EfficioPINVOKE.new_Hand(SWIGTYPE_p_BodySide.getCPtr(side), SWIGTYPE_p_arrayT_Efficio__Models__Body__Finger_5_t.getCPtr(fingers)), true) {
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public SWIGTYPE_p_BodySide Side {
    get {
      SWIGTYPE_p_BodySide ret = new SWIGTYPE_p_BodySide(EfficioPINVOKE.Hand_Side_get(swigCPtr), true);
      return ret;
    } 
  }

  public SWIGTYPE_p_arrayT_Efficio__Models__Body__Finger_5_t Fingers {
    get {
      SWIGTYPE_p_arrayT_Efficio__Models__Body__Finger_5_t ret = new SWIGTYPE_p_arrayT_Efficio__Models__Body__Finger_5_t(EfficioPINVOKE.Hand_Fingers_get(swigCPtr), true);
      return ret;
    } 
  }

}

}
