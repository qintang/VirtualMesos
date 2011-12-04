/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package mesos;

public class MesosExecutorDriver extends ExecutorDriver {
  private long swigCPtr;

  protected MesosExecutorDriver(long cPtr, boolean cMemoryOwn) {
    super(mesosJNI.SWIGMesosExecutorDriverUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MesosExecutorDriver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

    protected void finalize() {
      synchronized (executors) {
        executors.remove(getExecutor());
      }
      delete();
    }
  
  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mesosJNI.delete_MesosExecutorDriver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

    private static java.util.HashSet<Executor> executors =
      new java.util.HashSet<Executor>();

    private static long getCPtrAndAddReference(Executor executor) {
      synchronized (executors) {
        executors.add(executor);
      }
      return Executor.getCPtr(executor);
    }
  
  public MesosExecutorDriver(Executor executor) {
    this(mesosJNI.new_MesosExecutorDriver(getCPtrAndAddReference(executor), executor), true);
  }

  public int start() {
    return mesosJNI.MesosExecutorDriver_start(swigCPtr, this);
  }

  public int stop() {
    return mesosJNI.MesosExecutorDriver_stop(swigCPtr, this);
  }

  public int join() {
    return mesosJNI.MesosExecutorDriver_join(swigCPtr, this);
  }

  public int run() {
    return mesosJNI.MesosExecutorDriver_run(swigCPtr, this);
  }

  public int sendStatusUpdate(TaskStatus status) {
    return mesosJNI.MesosExecutorDriver_sendStatusUpdate(swigCPtr, this, TaskStatus.getCPtr(status), status);
  }

  public int sendFrameworkMessage(FrameworkMessage message) {
    return mesosJNI.MesosExecutorDriver_sendFrameworkMessage(swigCPtr, this, FrameworkMessage.getCPtr(message), message);
  }

  public Executor getExecutor() {
    long cPtr = mesosJNI.MesosExecutorDriver_getExecutor(swigCPtr, this);
    return (cPtr == 0) ? null : new Executor(cPtr, false);
  }

}
