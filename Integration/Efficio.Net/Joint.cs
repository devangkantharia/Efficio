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
          EfficioRuntimePINVOKE.delete_Joint(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public Joint() : this(EfficioRuntimePINVOKE.new_Joint__SWIG_0(), true) {
  }

  public Joint(Vector3 position, JointType type) : this(EfficioRuntimePINVOKE.new_Joint__SWIG_1(Vector3.getCPtr(position), (int)type), true) {
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public Joint(Vector3 position, JointType type, float confidence) : this(EfficioRuntimePINVOKE.new_Joint__SWIG_2(Vector3.getCPtr(position), (int)type, confidence), true) {
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
  }

  public bool Valid {
    set {
      EfficioRuntimePINVOKE.Joint_Valid_set(swigCPtr, value);
    } 
    get {
      bool ret = EfficioRuntimePINVOKE.Joint_Valid_get(swigCPtr);
      return ret;
    } 
  }

  public Vector3 Position {
    set {
      EfficioRuntimePINVOKE.Joint_Position_set(swigCPtr, Vector3.getCPtr(value));
    } 
    get {
      global::System.IntPtr cPtr = EfficioRuntimePINVOKE.Joint_Position_get(swigCPtr);
      Vector3 ret = (cPtr == global::System.IntPtr.Zero) ? null : new Vector3(cPtr, false);
      return ret;
    } 
  }

  public JointType Type {
    set {
      EfficioRuntimePINVOKE.Joint_Type_set(swigCPtr, (int)value);
    } 
    get {
      JointType ret = (JointType)EfficioRuntimePINVOKE.Joint_Type_get(swigCPtr);
      return ret;
    } 
  }

  public float Confidence {
    set {
      EfficioRuntimePINVOKE.Joint_Confidence_set(swigCPtr, value);
    } 
    get {
      float ret = EfficioRuntimePINVOKE.Joint_Confidence_get(swigCPtr);
      return ret;
    } 
  }

  public JointCollection ProximalJoints(Joint joint) {
    JointCollection ret = new JointCollection(EfficioRuntimePINVOKE.Joint_ProximalJoints(swigCPtr, Joint.getCPtr(joint)), true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public JointCollection DistalJoints(Joint joint) {
    JointCollection ret = new JointCollection(EfficioRuntimePINVOKE.Joint_DistalJoints(swigCPtr, Joint.getCPtr(joint)), true);
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public float DistanceTo(Joint joint) {
    float ret = EfficioRuntimePINVOKE.Joint_DistanceTo(swigCPtr, Joint.getCPtr(joint));
    if (EfficioRuntimePINVOKE.SWIGPendingException.Pending) throw EfficioRuntimePINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}

}
