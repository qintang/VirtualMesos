/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package mesos;

public class TaskStatus {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TaskStatus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TaskStatus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mesosJNI.delete_TaskStatus(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TaskStatus() {
    this(mesosJNI.new_TaskStatus__SWIG_0(), true);
  }

  public TaskStatus(int _taskId, TaskState _state, byte[] _data) {
    this(mesosJNI.new_TaskStatus__SWIG_1(_taskId, _state.swigValue(), _data), true);
  }

  public void setTaskId(int value) {
    mesosJNI.TaskStatus_taskId_set(swigCPtr, this, value);
  }

  public int getTaskId() {
    return mesosJNI.TaskStatus_taskId_get(swigCPtr, this);
  }

  public void setState(TaskState value) {
    mesosJNI.TaskStatus_state_set(swigCPtr, this, value.swigValue());
  }

  public TaskState getState() {
    return TaskState.swigToEnum(mesosJNI.TaskStatus_state_get(swigCPtr, this));
  }

  public void setData(byte[] value) {
    mesosJNI.TaskStatus_data_set(swigCPtr, this, value);
  }

  public byte[] getData() { 
    return mesosJNI.TaskStatus_data_get(swigCPtr, this); 
  }

}
