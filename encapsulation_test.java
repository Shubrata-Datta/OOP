public class encapsulation_test 
{
    public static void main(String[] args) 
    {
        _student st1=new _student(001,"Shubrata","Sylhet");
        // String add=st1.getAddress();
        // System.out.println(add);
        // st1.setaddress("Sylhet");
        // add=st1.getAddress();
        // System.out.println(add);
        System.out.println(st1.getAddress("shubrata","shubrata123"));
        System.out.println(st1.getAddress(null,null));
        _student st2=new _student(002,"Sumi","Dhaka","Sumi");
        st2.changePassword("Sumi",null,"sumi456");
        System.out.println(st2.getAddress("Sumi","sumi456"));
    }
    
}
