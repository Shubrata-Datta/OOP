public class _student {
    int id;
    String name;
    private String address;
    String username;
    String password;
    _student(){

    }
    _student(int id,String name,String address,String username)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.username=username;

    }
    _student(int id,String name,String address)
    {
        this.id=id;
        this.name=name;
        this.address=address;

    }
    public String getAddress(String u_name,String pass){
        if(this.username==u_name && this.password==pass)
        {
            return this.address;
        }
        else
        {
            return "unauthorized access";
        }   
    }
    public void changePassword(String u_name,String oldpass,String newpass)
    {
        if(this.username==u_name && this.password==oldpass)
        {
            this.password=newpass;
            System.out.println("Password changed successfully");
        }
        else
        {
            System.out.println("Incorrect password");
        }


    }
    public void setaddress(String s1)
    {
    //getters and setters can be used to access private data members 
        this.address=s1;   
    }
}
