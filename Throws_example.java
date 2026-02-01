//warns about probable exception but doesn't directly handle it
//written in method signature (in method and constructor signature but not directly in class signature)
//can write for both checked and unchecked exceptions but effective for checked exceptions
//when throws checked excceptions must be catched for unchecked exceptions it is optional

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws_example {
    Throws_example(){
        
    }
    public static void readFile() throws ArithmeticException, FileNotFoundException, IOException {
        FileInputStream fs = new FileInputStream("newfile.txt");
        System.out.println(7/0);
        //explicit ArithmeticException throw removed because the division above already causes it at runtime
        throw new IOException("Self Created IO Exception");
    }
    public static void main(String[] args) throws IOException {
        try 
        {
            readFile();
        } catch(FileNotFoundException e) {
            System.out.println("file not found");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
