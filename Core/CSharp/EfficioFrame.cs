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

public class EfficioFrame : Frame {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  private bool swigCMemOwnDerived;

  internal EfficioFrame(global::System.IntPtr cPtr, bool cMemoryOwn) : base(EfficioPINVOKE.EfficioFrame_SWIGSmartPtrUpcast(cPtr), true) {
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(EfficioFrame obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~EfficioFrame() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwnDerived) {
          swigCMemOwnDerived = false;
          EfficioPINVOKE.delete_EfficioFrame(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public int ID {
    set {
      EfficioPINVOKE.EfficioFrame_ID_set(swigCPtr, value);
      if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    } 
    get {
      int ret = EfficioPINVOKE.EfficioFrame_ID_get(swigCPtr);
      if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
      return ret;
    } 
  }

  public EfficioFrame(int ID) : this(EfficioPINVOKE.new_EfficioFrame(ID), true) {
  }

  public EventCollection GetEvents() {
    EventCollection ret = new EventCollection(EfficioPINVOKE.EfficioFrame_GetEvents(swigCPtr), true);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void AddEvent(Event eventPtr) {
    EfficioPINVOKE.EfficioFrame_AddEvent(swigCPtr, Event.getCPtr(eventPtr));
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

}

}
