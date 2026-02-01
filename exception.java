//checked exception and unchecked exception
//checked exception are checked at compile time
//must be handled using try-catch or throws keyword
//subclass of Exception class except RuntimeException and its subclasses
//examples: IOException, FileNotFoundException, ClassNotFoundException

//unchecked exception are not checked at compile time
//occur at runtime
//subclass of RuntimeException class
//examples: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException

//Throwable is the superclass of all errors and exceptions in Java
//two main subclasses: Error and Exception
//Error represents serious problems that a reasonable application should not try to catch
//exception represents conditions that a reasonable application might want to catch
//custom exception is user-defined exception class that extends Exception or RuntimeException class
//exception handling is the process of handling runtime errors using try-catch-finally blocks or throws keyword
//try block contains code that may throw an exception
//catch block contains code that handles the exception
//finally block contains code that is always executed regardless of whether an exception occurred or not
//throws keyword is used to declare that a method may throw an exception
//throw keyword is used to explicitly throw an exception
//finally block is used to execute important code such as closing resources
public class exception {
    public static void main(String[] args) {
        try {
            System.out.println("Program started");
            //System.out.println(7/0);
            int[] arr = new int[5];
            arr[2] = 10;
            arr[8] = 20;//This will throw ArrayIndexOutOfBoundsException
            System.out.println("Program ended");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Program ended");
        }
        
    }

    
}
