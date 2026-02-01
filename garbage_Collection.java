//garbage collection is the procss of automatic memory management in Java.
//The Java Virtual Machine (JVM) automatically identifies and removes objects that are no longer needed, freeing up memory resources.
//This process helps prevent memory leaks and optimizes the use of available memory.
//In Java, garbage collection is handled by the Garbage Collector (GC), which runs in the background and periodically checks for objects that are no longer reachable from any references in the program.
//When an object is no longer reachable, the GC reclaims the memory occupied by that object, making it available for future allocations.
//Java provides several garbage collection algorithms, including Mark-and-Sweep, Generational Garbage Collection, and G1 Garbage Collector, each with its own approach to managing memory efficiently.
//finalize() method is called by the garbage collector before an object is removed from memory.
//However, the use of finalize() is discouraged in modern Java programming due to its unpredictability and performance implications.
//Instead, developers are encouraged to use other resource management techniques, such as try-with-resources and explicit resource cleanup methods.

public class garbage_Collection 
{
    static garbage_Collection ref;
    @Override
    protected void finalize() throws Throwable 
    {
        System.out.println("Finalize called for " + this);
        ref = this; // Resurrecting the object
    }

    public static void main(String[] args) 
    {
        garbage_Collection obj1 = new garbage_Collection();
        garbage_Collection obj2 = new garbage_Collection();

        obj1 = null; // Making obj1 eligible for garbage collection
        obj2 = null; // Making obj2 eligible for garbage collection

        System.gc(); // Requesting the JVM to run the garbage collector
        System.out.println("First GC call completed."); 
    }

}
