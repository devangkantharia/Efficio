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

public class HandData : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal HandData(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(HandData obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~HandData() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioPINVOKE.delete_HandData(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public HandData() : this(EfficioPINVOKE.new_HandData(), true) {
  }

  public SWIGTYPE_p_std__vectorT_Efficio__Models__Human__Hand_t Hands {
    set {
      EfficioPINVOKE.HandData_Hands_set(swigCPtr, SWIGTYPE_p_std__vectorT_Efficio__Models__Human__Hand_t.getCPtr(value));
    } 
    get {
      global::System.IntPtr cPtr = EfficioPINVOKE.HandData_Hands_get(swigCPtr);
      SWIGTYPE_p_std__vectorT_Efficio__Models__Human__Hand_t ret = (cPtr == global::System.IntPtr.Zero) ? null : new SWIGTYPE_p_std__vectorT_Efficio__Models__Human__Hand_t(cPtr, false);
      return ret;
    } 
  }

}

}
