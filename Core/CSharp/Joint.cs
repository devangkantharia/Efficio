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

public class Joint : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal Joint(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Joint obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~Joint() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          EfficioPINVOKE.delete_Joint(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public Joint(Vector3 position, SWIGTYPE_p_JointType type) : this(EfficioPINVOKE.new_Joint__SWIG_0(Vector3.getCPtr(position), SWIGTYPE_p_JointType.getCPtr(type)), true) {
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public Joint(Vector3 position, SWIGTYPE_p_JointType type, float confidence) : this(EfficioPINVOKE.new_Joint__SWIG_1(Vector3.getCPtr(position), SWIGTYPE_p_JointType.getCPtr(type), confidence), true) {
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
  }

  public Vector3 Position {
    get {
      global::System.IntPtr cPtr = EfficioPINVOKE.Joint_Position_get(swigCPtr);
      Vector3 ret = (cPtr == global::System.IntPtr.Zero) ? null : new Vector3(cPtr, false);
      return ret;
    } 
  }

  public SWIGTYPE_p_JointType Type {
    get {
      SWIGTYPE_p_JointType ret = new SWIGTYPE_p_JointType(EfficioPINVOKE.Joint_Type_get(swigCPtr), true);
      return ret;
    } 
  }

  public float Confidence {
    get {
      float ret = EfficioPINVOKE.Joint_Confidence_get(swigCPtr);
      return ret;
    } 
  }

  public SWIGTYPE_p_std__vectorT_Efficio__Models__Body__Joint_t ProximalJoints(Joint joint) {
    SWIGTYPE_p_std__vectorT_Efficio__Models__Body__Joint_t ret = new SWIGTYPE_p_std__vectorT_Efficio__Models__Body__Joint_t(EfficioPINVOKE.Joint_ProximalJoints(swigCPtr, Joint.getCPtr(joint)), true);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public SWIGTYPE_p_std__vectorT_Efficio__Models__Body__Joint_t DistalJoints(Joint joint) {
    SWIGTYPE_p_std__vectorT_Efficio__Models__Body__Joint_t ret = new SWIGTYPE_p_std__vectorT_Efficio__Models__Body__Joint_t(EfficioPINVOKE.Joint_DistalJoints(swigCPtr, Joint.getCPtr(joint)), true);
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public float DistanceTo(Joint joint) {
    float ret = EfficioPINVOKE.Joint_DistanceTo(swigCPtr, Joint.getCPtr(joint));
    if (EfficioPINVOKE.SWIGPendingException.Pending) throw EfficioPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
