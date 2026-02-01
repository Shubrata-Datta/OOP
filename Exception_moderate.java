import java.io.FileInputStream;
public class Exception_moderate {
    void m3(){
        try{
        //System.out.println(7/0);
        FileInputStream fs = new FileInputStream("newfile.txt");
        System.out.println("inside m3");
        }
        catch(Exception e){
            System.out.println("File not found exception handled in m3");
        }
        }
        // catch(ArithmeticException e){
        //     System.out.println("exception handled in m3");
        // }

    void m2(){
        m3();
        System.out.println("inside m2");
        
    }
    void m1(){
        try{
            m2();
        }
        catch(Exception e){
            System.out.println("Inside m1 for m3 exception");
        }
        //System.out.println("inside m1");

    }
    public static void main(String[] args) {
        Exception_moderate obj = new Exception_moderate();
        obj.m1();
    }
    
}
