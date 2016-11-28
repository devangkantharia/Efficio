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

public class Finger : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal Finger(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Finger obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~Finger() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioPINVOKE.delete_Finger(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public Finger() : this(EfficioPINVOKE.new_Finger__SWIG_0(), true) {
  }

  public Finger(FingerType fingerType, bool isExtended, float length, Joint tip, Joint dip, Joint mcp, Joint pip) : this(EfficioPINVOKE.new_Finger__SWIG_1((int)fingerType, isExtended, length, Joint.getCPtr(tip), Joint.getCPtr(dip), Joint.getCPtr(mcp), Joint.getCPtr(pip)), true) {
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public Joint Tip {
    set {
      EfficioPINVOKE.Finger_Tip_set(swigCPtr, Joint.getCPtr(value));
    } 
    get {
      global::System.IntPtr cPtr = EfficioPINVOKE.Finger_Tip_get(swigCPtr);
      Joint ret = (cPtr == global::System.IntPtr.Zero) ? null : new Joint(cPtr, false);
      return ret;
    } 
  }

  public Joint DIP {
    set {
      EfficioPINVOKE.Finger_DIP_set(swigCPtr, Joint.getCPtr(value));
    } 
    get {
      global::System.IntPtr cPtr = EfficioPINVOKE.Finger_DIP_get(swigCPtr);
      Joint ret = (cPtr == global::System.IntPtr.Zero) ? null : new Joint(cPtr, false);
      return ret;
    } 
  }

  public Joint MCP {
    set {
      EfficioPINVOKE.Finger_MCP_set(swigCPtr, Joint.getCPtr(value));
    } 
    get {
      global::System.IntPtr cPtr = EfficioPINVOKE.Finger_MCP_get(swigCPtr);
      Joint ret = (cPtr == global::System.IntPtr.Zero) ? null : new Joint(cPtr, false);
      return ret;
    } 
  }

  public Joint PIP {
    set {
      EfficioPINVOKE.Finger_PIP_set(swigCPtr, Joint.getCPtr(value));
    } 
    get {
      global::System.IntPtr cPtr = EfficioPINVOKE.Finger_PIP_get(swigCPtr);
      Joint ret = (cPtr == global::System.IntPtr.Zero) ? null : new Joint(cPtr, false);
      return ret;
    } 
  }

  public bool Valid {
    set {
      EfficioPINVOKE.Finger_Valid_set(swigCPtr, value);
    } 
    get {
      bool ret = EfficioPINVOKE.Finger_Valid_get(swigCPtr);
      return ret;
    } 
  }

  public FingerType FingerType {
    set {
      EfficioPINVOKE.Finger_FingerType_set(swigCPtr, (int)value);
    } 
    get {
      FingerType ret = (FingerType)EfficioPINVOKE.Finger_FingerType_get(swigCPtr);
      return ret;
    } 
  }

  public bool IsExtended {
    set {
      EfficioPINVOKE.Finger_IsExtended_set(swigCPtr, value);
    } 
    get {
      bool ret = EfficioPINVOKE.Finger_IsExtended_get(swigCPtr);
      return ret;
    } 
  }

  public float Length {
    set {
      EfficioPINVOKE.Finger_Length_set(swigCPtr, value);
    } 
    get {
      float ret = EfficioPINVOKE.Finger_Length_get(swigCPtr);
      return ret;
    } 
  }

}

}
