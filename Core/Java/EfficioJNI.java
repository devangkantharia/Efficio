/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class EfficioJNI {
  public final static native long new_Vector3__SWIG_0();
  public final static native long new_Vector3__SWIG_1(float jarg1, float jarg2, float jarg3);
  public final static native void delete_Vector3(long jarg1);
  public final static native float Vector3_DistanceTo(long jarg1, Vector3 jarg1_, long jarg2, Vector3 jarg2_);
  public final static native float Vector3_X(long jarg1, Vector3 jarg1_);
  public final static native float Vector3_Y(long jarg1, Vector3 jarg1_);
  public final static native float Vector3_Z(long jarg1, Vector3 jarg1_);
  public final static native long Vector3_Midpoint(long jarg1, Vector3 jarg1_, long jarg2, Vector3 jarg2_);
  public final static native void delete_Data(long jarg1);
  public final static native int Data_GetDataType(long jarg1, Data jarg1_);
  public final static native long new_Joint__SWIG_0();
  public final static native long new_Joint__SWIG_1(long jarg1, Vector3 jarg1_, int jarg2);
  public final static native long new_Joint__SWIG_2(long jarg1, Vector3 jarg1_, int jarg2, float jarg3);
  public final static native void delete_Joint(long jarg1);
  public final static native void Joint_Valid_set(long jarg1, Joint jarg1_, boolean jarg2);
  public final static native boolean Joint_Valid_get(long jarg1, Joint jarg1_);
  public final static native void Joint_Position_set(long jarg1, Joint jarg1_, long jarg2, Vector3 jarg2_);
  public final static native long Joint_Position_get(long jarg1, Joint jarg1_);
  public final static native void Joint_Type_set(long jarg1, Joint jarg1_, int jarg2);
  public final static native int Joint_Type_get(long jarg1, Joint jarg1_);
  public final static native void Joint_Confidence_set(long jarg1, Joint jarg1_, float jarg2);
  public final static native float Joint_Confidence_get(long jarg1, Joint jarg1_);
  public final static native long Joint_ProximalJoints(long jarg1, Joint jarg1_, long jarg2, Joint jarg2_);
  public final static native long Joint_DistalJoints(long jarg1, Joint jarg1_, long jarg2, Joint jarg2_);
  public final static native float Joint_DistanceTo(long jarg1, Joint jarg1_, long jarg2, Joint jarg2_);
  public final static native long new_Finger__SWIG_0();
  public final static native long new_Finger__SWIG_1(int jarg1, boolean jarg2, float jarg3, long jarg4, Joint jarg4_, long jarg5, Joint jarg5_, long jarg6, Joint jarg6_, long jarg7, Joint jarg7_);
  public final static native void delete_Finger(long jarg1);
  public final static native void Finger_Tip_set(long jarg1, Finger jarg1_, long jarg2, Joint jarg2_);
  public final static native long Finger_Tip_get(long jarg1, Finger jarg1_);
  public final static native void Finger_DIP_set(long jarg1, Finger jarg1_, long jarg2, Joint jarg2_);
  public final static native long Finger_DIP_get(long jarg1, Finger jarg1_);
  public final static native void Finger_MCP_set(long jarg1, Finger jarg1_, long jarg2, Joint jarg2_);
  public final static native long Finger_MCP_get(long jarg1, Finger jarg1_);
  public final static native void Finger_PIP_set(long jarg1, Finger jarg1_, long jarg2, Joint jarg2_);
  public final static native long Finger_PIP_get(long jarg1, Finger jarg1_);
  public final static native void Finger_Valid_set(long jarg1, Finger jarg1_, boolean jarg2);
  public final static native boolean Finger_Valid_get(long jarg1, Finger jarg1_);
  public final static native void Finger_FingerType_set(long jarg1, Finger jarg1_, int jarg2);
  public final static native int Finger_FingerType_get(long jarg1, Finger jarg1_);
  public final static native void Finger_IsExtended_set(long jarg1, Finger jarg1_, boolean jarg2);
  public final static native boolean Finger_IsExtended_get(long jarg1, Finger jarg1_);
  public final static native void Finger_Length_set(long jarg1, Finger jarg1_, float jarg2);
  public final static native float Finger_Length_get(long jarg1, Finger jarg1_);
  public final static native long new_Hand__SWIG_0(int jarg1, long jarg2, FingerCollection jarg2_, float jarg3);
  public final static native long new_Hand__SWIG_1(int jarg1, long jarg2, FingerCollection jarg2_);
  public final static native void delete_Hand(long jarg1);
  public final static native void Hand_Side_set(long jarg1, Hand jarg1_, int jarg2);
  public final static native int Hand_Side_get(long jarg1, Hand jarg1_);
  public final static native void Hand_Confidence_set(long jarg1, Hand jarg1_, float jarg2);
  public final static native float Hand_Confidence_get(long jarg1, Hand jarg1_);
  public final static native void Hand_Fingers_set(long jarg1, Hand jarg1_, long jarg2, FingerCollection jarg2_);
  public final static native long Hand_Fingers_get(long jarg1, Hand jarg1_);
  public final static native void delete_Event(long jarg1);
  public final static native void Event_Time_set(long jarg1, Event jarg1_, long jarg2);
  public final static native long Event_Time_get(long jarg1, Event jarg1_);
  public final static native int Event_GetEventType(long jarg1, Event jarg1_);
  public final static native long new_Frame__SWIG_0(int jarg1);
  public final static native long new_Frame__SWIG_1();
  public final static native void delete_Frame(long jarg1);
  public final static native long Frame_GetData(long jarg1, Frame jarg1_);
  public final static native void Frame_AddData(long jarg1, Frame jarg1_, long jarg2, DataCollection jarg2_);
  public final static native void Frame_AddFrame(long jarg1, Frame jarg1_, long jarg2, Frame jarg2_);
  public final static native long Frame_GetEvents(long jarg1, Frame jarg1_);
  public final static native void Frame_AddEvent(long jarg1, Frame jarg1_, long jarg2, Event jarg2_);
  public final static native void Frame_ID_set(long jarg1, Frame jarg1_, int jarg2);
  public final static native int Frame_ID_get(long jarg1, Frame jarg1_);
  public final static native long new_Engine();
  public final static native void delete_Engine(long jarg1);
  public final static native void Engine_Start(long jarg1, Engine jarg1_);
  public final static native long Engine_GetFrame__SWIG_0(long jarg1, Engine jarg1_);
  public final static native long Engine_GetFrame__SWIG_1(long jarg1, Engine jarg1_, int jarg2);
  public final static native void delete_Gesture(long jarg1);
  public final static native int Gesture_GetType(long jarg1, Gesture jarg1_);
  public final static native int Gesture_GetGestureState(long jarg1, Gesture jarg1_);
  public final static native long Gesture_GetStartTime(long jarg1, Gesture jarg1_);
  public final static native long Gesture_GetGestureDuration(long jarg1, Gesture jarg1_);
  public final static native int Gesture_GetEventType(long jarg1, Gesture jarg1_);
  public final static native void delete_DiscreteGesture(long jarg1);
  public final static native int DiscreteGesture_GetType(long jarg1, DiscreteGesture jarg1_);
  public final static native int DiscreteGesture_GetGestureState(long jarg1, DiscreteGesture jarg1_);
  public final static native long new_Pinch(int jarg1, long jarg2, Finger jarg2_, long jarg3, Finger jarg3_);
  public final static native void delete_Pinch(long jarg1);
  public final static native void Pinch_Position_set(long jarg1, Pinch jarg1_, long jarg2, Vector3 jarg2_);
  public final static native long Pinch_Position_get(long jarg1, Pinch jarg1_);
  public final static native void Pinch_Finger1_set(long jarg1, Pinch jarg1_, long jarg2, Finger jarg2_);
  public final static native long Pinch_Finger1_get(long jarg1, Pinch jarg1_);
  public final static native void Pinch_Finger2_set(long jarg1, Pinch jarg1_, long jarg2, Finger jarg2_);
  public final static native long Pinch_Finger2_get(long jarg1, Pinch jarg1_);
  public final static native int Pinch_GetEventType(long jarg1, Pinch jarg1_);
  public final static native void Pinch_Side_set(long jarg1, Pinch jarg1_, int jarg2);
  public final static native int Pinch_Side_get(long jarg1, Pinch jarg1_);
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
  public final static native long new_GestureCollection__SWIG_0();
  public final static native long new_GestureCollection__SWIG_1(long jarg1);
  public final static native long GestureCollection_size(long jarg1, GestureCollection jarg1_);
  public final static native long GestureCollection_capacity(long jarg1, GestureCollection jarg1_);
  public final static native void GestureCollection_reserve(long jarg1, GestureCollection jarg1_, long jarg2);
  public final static native boolean GestureCollection_isEmpty(long jarg1, GestureCollection jarg1_);
  public final static native void GestureCollection_clear(long jarg1, GestureCollection jarg1_);
  public final static native void GestureCollection_add(long jarg1, GestureCollection jarg1_, long jarg2, Gesture jarg2_);
  public final static native long GestureCollection_get(long jarg1, GestureCollection jarg1_, int jarg2);
  public final static native void GestureCollection_set(long jarg1, GestureCollection jarg1_, int jarg2, long jarg3, Gesture jarg3_);
  public final static native void delete_GestureCollection(long jarg1);
  public final static native long new_DataCollection__SWIG_0();
  public final static native long new_DataCollection__SWIG_1(long jarg1);
  public final static native long DataCollection_size(long jarg1, DataCollection jarg1_);
  public final static native long DataCollection_capacity(long jarg1, DataCollection jarg1_);
  public final static native void DataCollection_reserve(long jarg1, DataCollection jarg1_, long jarg2);
  public final static native boolean DataCollection_isEmpty(long jarg1, DataCollection jarg1_);
  public final static native void DataCollection_clear(long jarg1, DataCollection jarg1_);
  public final static native void DataCollection_add(long jarg1, DataCollection jarg1_, long jarg2, Data jarg2_);
  public final static native long DataCollection_get(long jarg1, DataCollection jarg1_, int jarg2);
  public final static native void DataCollection_set(long jarg1, DataCollection jarg1_, int jarg2, long jarg3, Data jarg3_);
  public final static native void delete_DataCollection(long jarg1);
  public final static native long new_JointCollection__SWIG_0();
  public final static native long new_JointCollection__SWIG_1(long jarg1);
  public final static native long JointCollection_size(long jarg1, JointCollection jarg1_);
  public final static native long JointCollection_capacity(long jarg1, JointCollection jarg1_);
  public final static native void JointCollection_reserve(long jarg1, JointCollection jarg1_, long jarg2);
  public final static native boolean JointCollection_isEmpty(long jarg1, JointCollection jarg1_);
  public final static native void JointCollection_clear(long jarg1, JointCollection jarg1_);
  public final static native void JointCollection_add(long jarg1, JointCollection jarg1_, long jarg2, Joint jarg2_);
  public final static native long JointCollection_get(long jarg1, JointCollection jarg1_, int jarg2);
  public final static native void JointCollection_set(long jarg1, JointCollection jarg1_, int jarg2, long jarg3, Joint jarg3_);
  public final static native void delete_JointCollection(long jarg1);
  public final static native long new_FingerCollection__SWIG_0();
  public final static native long new_FingerCollection__SWIG_1(long jarg1, FingerCollection jarg1_);
  public final static native long FingerCollection_size(long jarg1, FingerCollection jarg1_);
  public final static native boolean FingerCollection_isEmpty(long jarg1, FingerCollection jarg1_);
  public final static native void FingerCollection_fill(long jarg1, FingerCollection jarg1_, long jarg2, Finger jarg2_);
  public final static native long FingerCollection_get(long jarg1, FingerCollection jarg1_, int jarg2);
  public final static native void FingerCollection_set(long jarg1, FingerCollection jarg1_, int jarg2, long jarg3, Finger jarg3_);
  public final static native void delete_FingerCollection(long jarg1);
  public final static native long Gesture_SWIGSmartPtrUpcast(long jarg1);
  public final static native long DiscreteGesture_SWIGSmartPtrUpcast(long jarg1);
  public final static native long Pinch_SWIGSmartPtrUpcast(long jarg1);
}
