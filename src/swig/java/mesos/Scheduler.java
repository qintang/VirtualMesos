/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package mesos;

public class Scheduler {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Scheduler(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Scheduler obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mesosJNI.delete_Scheduler(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    mesosJNI.Scheduler_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    mesosJNI.Scheduler_change_ownership(this, swigCPtr, true);
  }

  public String getFrameworkName(SchedulerDriver arg0) {
    return (getClass() == Scheduler.class) ? mesosJNI.Scheduler_getFrameworkName(swigCPtr, this, SchedulerDriver.getCPtr(arg0), arg0) : mesosJNI.Scheduler_getFrameworkNameSwigExplicitScheduler(swigCPtr, this, SchedulerDriver.getCPtr(arg0), arg0);
  }

  public ExecutorInfo getExecutorInfo(SchedulerDriver arg0) {
    return new ExecutorInfo((getClass() == Scheduler.class) ? mesosJNI.Scheduler_getExecutorInfo(swigCPtr, this, SchedulerDriver.getCPtr(arg0), arg0) : mesosJNI.Scheduler_getExecutorInfoSwigExplicitScheduler(swigCPtr, this, SchedulerDriver.getCPtr(arg0), arg0), true);
  }

  public void registered(SchedulerDriver d, String fid) {
    if (getClass() == Scheduler.class) mesosJNI.Scheduler_registered(swigCPtr, this, SchedulerDriver.getCPtr(d), d, fid); else mesosJNI.Scheduler_registeredSwigExplicitScheduler(swigCPtr, this, SchedulerDriver.getCPtr(d), d, fid);
  }

  public void resourceOffer(SchedulerDriver d, String oid, java.util.List<SlaveOffer> offers) {
    if (getClass() == Scheduler.class) mesosJNI.Scheduler_resourceOffer(swigCPtr, this, SchedulerDriver.getCPtr(d), d, oid, offers); else mesosJNI.Scheduler_resourceOfferSwigExplicitScheduler(swigCPtr, this, SchedulerDriver.getCPtr(d), d, oid, offers);
  }

  public void offerRescinded(SchedulerDriver d, String oid) {
    if (getClass() == Scheduler.class) mesosJNI.Scheduler_offerRescinded(swigCPtr, this, SchedulerDriver.getCPtr(d), d, oid); else mesosJNI.Scheduler_offerRescindedSwigExplicitScheduler(swigCPtr, this, SchedulerDriver.getCPtr(d), d, oid);
  }

  public void statusUpdate(SchedulerDriver d, TaskStatus status) {
    if (getClass() == Scheduler.class) mesosJNI.Scheduler_statusUpdate(swigCPtr, this, SchedulerDriver.getCPtr(d), d, TaskStatus.getCPtr(status), status); else mesosJNI.Scheduler_statusUpdateSwigExplicitScheduler(swigCPtr, this, SchedulerDriver.getCPtr(d), d, TaskStatus.getCPtr(status), status);
  }

  public void frameworkMessage(SchedulerDriver d, FrameworkMessage message) {
    if (getClass() == Scheduler.class) mesosJNI.Scheduler_frameworkMessage(swigCPtr, this, SchedulerDriver.getCPtr(d), d, FrameworkMessage.getCPtr(message), message); else mesosJNI.Scheduler_frameworkMessageSwigExplicitScheduler(swigCPtr, this, SchedulerDriver.getCPtr(d), d, FrameworkMessage.getCPtr(message), message);
  }

  public void slaveLost(SchedulerDriver d, String sid) {
    if (getClass() == Scheduler.class) mesosJNI.Scheduler_slaveLost(swigCPtr, this, SchedulerDriver.getCPtr(d), d, sid); else mesosJNI.Scheduler_slaveLostSwigExplicitScheduler(swigCPtr, this, SchedulerDriver.getCPtr(d), d, sid);
  }

  public void error(SchedulerDriver d, int code, String message) {
    if (getClass() == Scheduler.class) mesosJNI.Scheduler_error(swigCPtr, this, SchedulerDriver.getCPtr(d), d, code, message); else mesosJNI.Scheduler_errorSwigExplicitScheduler(swigCPtr, this, SchedulerDriver.getCPtr(d), d, code, message);
  }

  public Scheduler() {
    this(mesosJNI.new_Scheduler(), true);
    mesosJNI.Scheduler_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
