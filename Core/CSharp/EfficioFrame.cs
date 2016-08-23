//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.10
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace Efficio.Runtime {

public class EfficioFrame : Frame {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;

  internal EfficioFrame(global::System.IntPtr cPtr, bool cMemoryOwn) : base(EfficioRuntimePINVOKE.EfficioFrame_SWIGUpcast(cPtr), cMemoryOwn) {
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
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioRuntimePINVOKE.delete_EfficioFrame(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public EfficioFrame() : this(EfficioRuntimePINVOKE.new_EfficioFrame(), true) {
  }

  public EventCollection GetEvents() {
    EventCollection ret = new EventCollection(EfficioRuntimePINVOKE.EfficioFrame_GetEvents(swigCPtr), true);
    return ret;
  }

  public void AddEvent(Event eventPtr) {
    EfficioRuntimePINVOKE.EfficioFrame_AddEvent(swigCPtr, Event.getCPtr(eventPtr));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

}

}
