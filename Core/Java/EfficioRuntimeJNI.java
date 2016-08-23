/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Runtime;

public class EfficioRuntimeJNI {
  public final static native long new_Vector3(float jarg1, float jarg2, float jarg3);
  public final static native void delete_Vector3(long jarg1);
  public final static native float Vector3_X(long jarg1, Vector3 jarg1_);
  public final static native float Vector3_Y(long jarg1, Vector3 jarg1_);
  public final static native float Vector3_Z(long jarg1, Vector3 jarg1_);
  public final static native long new_Event();
  public final static native void delete_Event(long jarg1);
  public final static native long new_Frame();
  public final static native void delete_Frame(long jarg1);
  public final static native long new_PinchEvent(int jarg1, long jarg2, Vector3 jarg2_);
  public final static native void delete_PinchEvent(long jarg1);
  public final static native int PinchEvent_Side(long jarg1, PinchEvent jarg1_);
  public final static native String PinchEvent_Finger1(long jarg1, PinchEvent jarg1_);
  public final static native String PinchEvent_Finger2(long jarg1, PinchEvent jarg1_);
  public final static native long PinchEvent_Position(long jarg1, PinchEvent jarg1_);
  public final static native long new_EfficioFrame();
  public final static native void delete_EfficioFrame(long jarg1);
  public final static native long EfficioFrame_GetEvents(long jarg1, EfficioFrame jarg1_);
  public final static native void EfficioFrame_AddEvent(long jarg1, EfficioFrame jarg1_, long jarg2, Event jarg2_);
  public final static native long new_Engine();
  public final static native void delete_Engine(long jarg1);
  public final static native void Engine_Start(long jarg1, Engine jarg1_);
  public final static native long Engine_GetFrame(long jarg1, Engine jarg1_);
  public final static native void Engine_DeviceConfiguration_set(long jarg1, Engine jarg1_, long jarg2, DeviceConfiguration jarg2_);
  public final static native long Engine_DeviceConfiguration_get(long jarg1, Engine jarg1_);
  public final static native long new_LeapConfiguration();
  public final static native void delete_LeapConfiguration(long jarg1);
  public final static native void LeapConfiguration_Enabled_set(long jarg1, LeapConfiguration jarg1_, boolean jarg2);
  public final static native boolean LeapConfiguration_Enabled_get(long jarg1, LeapConfiguration jarg1_);
  public final static native long new_DeviceConfiguration();
  public final static native void delete_DeviceConfiguration(long jarg1);
  public final static native long DeviceConfiguration_GetLeapConfiguration(long jarg1, DeviceConfiguration jarg1_);
  public final static native void DeviceConfiguration_SetLeapConfiguration(long jarg1, DeviceConfiguration jarg1_, long jarg2, LeapConfiguration jarg2_);
  public final static native long new_EventCollection__SWIG_0();
  public final static native long new_EventCollection__SWIG_1(long jarg1);
  public final static native long EventCollection_size(long jarg1, EventCollection jarg1_);
  public final static native long EventCollection_capacity(long jarg1, EventCollection jarg1_);
  public final static native void EventCollection_reserve(long jarg1, EventCollection jarg1_, long jarg2);
  public final static native boolean EventCollection_isEmpty(long jarg1, EventCollection jarg1_);
  public final static native void EventCollection_clear(long jarg1, EventCollection jarg1_);
  public final static native void EventCollection_add(long jarg1, EventCollection jarg1_, long jarg2, Event jarg2_);
  public final static native long EventCollection_get(long jarg1, EventCollection jarg1_, int jarg2);
  public final static native void EventCollection_set(long jarg1, EventCollection jarg1_, int jarg2, long jarg3, Event jarg3_);
  public final static native void delete_EventCollection(long jarg1);
  public final static native long PinchEvent_SWIGSmartPtrUpcast(long jarg1);
  public final static native long EfficioFrame_SWIGUpcast(long jarg1);
}
