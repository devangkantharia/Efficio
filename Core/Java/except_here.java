/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package Efficio.Java;

public class except_here {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected except_here(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(except_here obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        EfficioJNI.delete_except_here(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public except_here(String file_, int line_) {
    this(EfficioJNI.new_except_here(file_, line_), true);
  }

  public void setFile(String value) {
    EfficioJNI.except_here_file_set(swigCPtr, this, value);
  }

  public String getFile() {
    return EfficioJNI.except_here_file_get(swigCPtr, this);
  }

  public void setLine(int value) {
    EfficioJNI.except_here_line_set(swigCPtr, this, value);
  }

  public int getLine() {
    return EfficioJNI.except_here_line_get(swigCPtr, this);
  }

}