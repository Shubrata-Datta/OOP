//Thead means a separate path of execution in a program.
//multithreading is a programming concept that allows multiple threads to run concurrently within a single program.
//Each thread represents an independent flow of control, enabling tasks to be performed simultaneously or in an interleaved manner.
//multiple threads can share the same memory space, which allows for efficient communication and data sharing between them.
//multithreading is commonly used to improve the performance of applications, especially in scenarios involving I/O operations, user interfaces, and parallel processing.
//two ways using thread in java
//1. by extending the Thread class 
//2. by implementing the Runnable interface

//thread lifecycle
//1. New: A thread is created but not yet started.
//2. Runnable: The thread is ready to run and is waiting for CPU time.
//3. Running: The thread is currently executing.
//4. Blocked/Waiting: The thread
//5. Terminated: The thread has completed its execution.

//Tread methods
//1. start(): begins a new thread of execution.
//2. run(): contains the code that defines the thread's behavior.
//3. sleep(): pauses the thread for a specified period.
//4. join(): waits for a thread to die.
//5. yield(): temporarily pauses the thread to allow other threads to execute.
//6.is Alive(): checks if the thread is still running.
//7. set Priority(): sets the priority of the thread.
//8. get Priority(): gets the priority of the thread.
//9. set Name(): sets the name of the thread.
//10. get Name(): gets the name of the thread.
public class ThreadBasic extends Thread {
    @Override
    public void run(){
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }public static void main(String[] args) {
        ThreadBasic thread1 = new ThreadBasic();
        thread1.start(); // Start the thread, which calls the run() method
    }
    
}
