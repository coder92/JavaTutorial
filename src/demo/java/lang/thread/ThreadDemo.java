package demo.java.lang.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Thread Running: "+Thread.currentThread());
		Thread t1 = new Thread(new Thread1());
		t1.setName("Thread1");
		t1.start();
		
		System.out.println("----Demo:void	interrupt()----");
		//t1.interrupt();
		
		System.out.println("----Demo:isInterrupted()");
		System.out.println(t1.isInterrupted());
	}

}

class Thread1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread Running: "+Thread.currentThread());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread()+">> somebody waked up me");
		}
		System.out.println(Thread.currentThread()+">> after Sleep");
	}
}

//https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html
/*Method Summary
static int	activeCount()      				: Returns an estimate of the number of active threads in the current thread's thread group and its subgroups.
void	checkAccess()          				: Determines if the currently running thread has permission to modify this thread.
protected Object	clone()    				: Throws CloneNotSupportedException as a Thread can not be meaningfully cloned.
int	countStackFrames()         				: Deprecated. The definition of this call depends on suspend(), which is deprecated. Further, the results of this call were never well-defined.
static Thread	currentThread()				: Returns a reference to the currently executing thread object.
void	destroy()              				: Deprecated.  This method was originally designed to destroy this thread without any cleanup. Any monitors it held would have remained locked. However, the method was never implemented. If if were to be implemented, it would be deadlock-prone in much the manner of suspend(). If the target thread held a lock protecting a critical system resource when it was destroyed, no thread could ever access this resource again. If another thread ever attempted to lock this resource, deadlock would result. Such deadlocks typically manifest themselves as "frozen" processes. For more information, see Why are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
static void	dumpStack()        				: Prints a stack trace of the current thread to the standard error stream.
static int	enumerate(Thread[] tarray) 		: Copies into the specified array every active thread in the current thread's thread group and its subgroups.
static Map<Thread,StackTraceElement[]>		:getAllStackTraces() :Returns a map of stack traces for all live threads.
ClassLoader	getContextClassLoader()			: Returns the context ClassLoader for this Thread.
static Thread.UncaughtExceptionHandler	getDefaultUncaughtExceptionHandler(): Returns the default handler invoked when a thread abruptly terminates due to an uncaught exception.
long	getId()								: Returns the identifier of this Thread.
String	getName()							: Returns this thread's name.
int	getPriority()							: Returns this thread's priority.
StackTraceElement[]	getStackTrace()			: Returns an array of stack trace elements representing the stack dump of this thread.
Thread.State	getState()					: Returns the state of this thread.
ThreadGroup	getThreadGroup()				: Returns the thread group to which this thread belongs.
Thread.UncaughtExceptionHandler	getUncaughtExceptionHandler(): Returns the handler invoked when this thread abruptly terminates due to an uncaught exception.
static boolean	holdsLock(Object obj)		:	Returns true if and only if the current thread holds the monitor lock on the specified object.
void	interrupt()							:Interrupts this thread.
static boolean	interrupted()				:Tests whether the current thread has been interrupted.
boolean	isAlive()							:Tests if this thread is alive.
boolean	isDaemon()							:Tests if this thread is a daemon thread.
boolean	isInterrupted()						:Tests whether this thread has been interrupted.
void	join()								:Waits for this thread to die.
void	join(long millis)					:Waits at most millis milliseconds for this thread to die.
void	join(long millis, int nanos)		:Waits at most millis milliseconds plus nanos nanoseconds for this thread to die.
void	resume()							:Deprecated. This method exists solely for use with suspend(), which has been deprecated because it is deadlock-prone. For more information, see Why are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
void	run() :If this thread was constructed using a separate Runnable run object, then that Runnable object's run method is called; otherwise, this method does nothing and returns.
void	setContextClassLoader(ClassLoader cl):Sets the context ClassLoader for this Thread.
void	setDaemon(boolean on)
Marks this thread as either a daemon thread or a user thread.
static void	setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh)
Set the default handler invoked when a thread abruptly terminates due to an uncaught exception, and no other handler has been defined for that thread.
void	setName(String name)
Changes the name of this thread to be equal to the argument name.
void	setPriority(int newPriority)
Changes the priority of this thread.
void	setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler eh)
Set the handler invoked when this thread abruptly terminates due to an uncaught exception.
static void	sleep(long millis)
Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers.
static void	sleep(long millis, int nanos)
Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds plus the specified number of nanoseconds, subject to the precision and accuracy of system timers and schedulers.
void	start()
Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
void	stop()
Deprecated. 
This method is inherently unsafe. Stopping a thread with Thread.stop causes it to unlock all of the monitors that it has locked (as a natural consequence of the unchecked ThreadDeath exception propagating up the stack). If any of the objects previously protected by these monitors were in an inconsistent state, the damaged objects become visible to other threads, potentially resulting in arbitrary behavior. Many uses of stop should be replaced by code that simply modifies some variable to indicate that the target thread should stop running. The target thread should check this variable regularly, and return from its run method in an orderly fashion if the variable indicates that it is to stop running. If the target thread waits for long periods (on a condition variable, for example), the interrupt method should be used to interrupt the wait. For more information, see Why are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
void	stop(Throwable obj)
Deprecated. 
This method is inherently unsafe. See stop() for details. An additional danger of this method is that it may be used to generate exceptions that the target thread is unprepared to handle (including checked exceptions that the thread could not possibly throw, were it not for this method). For more information, see Why are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
void	suspend()
Deprecated. 
This method has been deprecated, as it is inherently deadlock-prone. If the target thread holds a lock on the monitor protecting a critical system resource when it is suspended, no thread can access this resource until the target thread is resumed. If the thread that would resume the target thread attempts to lock this monitor prior to calling resume, deadlock results. Such deadlocks typically manifest themselves as "frozen" processes. For more information, see Why are Thread.stop, Thread.suspend and Thread.resume Deprecated?.
String	toString()
Returns a string representation of this thread, including the thread's name, priority, and thread group.
static void	yield()
A hint to the scheduler that the current thread is willing to yield its current use of a processor.
 * 
*/