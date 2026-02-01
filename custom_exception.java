public class custom_exception extends Exception 
{
    custom_exception(String message) 
    {
        super(message);
    }
    public static void main(String[] args) 
    {
        //System.out.println("7/0");
        try{
        throw new custom_exception("Custom Exception Occurred");
    }catch(custom_exception e){
        System.out.println(e.getMessage());
    }
    }
     
    
}
