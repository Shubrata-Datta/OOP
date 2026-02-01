//block is a enclosed area with curly braces {}
//types of blocks: method block, static block, instance block, local block
//block is used to group statements together, it defines scope and lifetime of variables
//variables declared inside a block are local to that block and cannot be accessed outside
//blocks can be nested within other blocks
//static block is used to initialize static variables, it runs once when the class is loaded
//instance block is used to initialize instance variables, it runs every time an object is created
//constructor block is used to initialize objects, it runs when a constructor is called
//syncronized block is used to control access to a shared resource by multiple threads
//local block is used inside methods to limit the scope of variables
public class block {
    static {
        System.out.println("Static block executed");
    }

    //Instance (non-static) block
    {
        System.out.println("Instance block executed");
    }

    // Constructor (it is also a block)
    block () 
    {
        System.out.println("Constructor executed");
    }

    //Method block
    void show(int n) {

        //Local block
        {
            int x = 10;
            System.out.println("Local block value: " + x);
        }

        //Conditional block
        if (n > 0) {
            System.out.println("If block executed");
        } 
        else {
            System.out.println("Else block executed");
        }

        //Loop block
        for (int i = 1; i <= 3; i++) 
        {
            System.out.println("Loop block: " + i);
        }

        //Synchronized block
        synchronized (this) {
            System.out.println("Synchronized block executed");
        }
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("Main method started");

        block obj = new block();

        obj.show(5);

        System.out.println("Main method ended");
    }
}
