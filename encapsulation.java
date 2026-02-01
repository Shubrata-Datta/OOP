//encapsulation in Java is a fundamental object-oriented programming concept that restricts direct access to an object's data and methods. 
//It is achieved by using access modifiers to control visibility. 
//The main benefits of encapsulation is access control mechanism,data hiding,wraping up,can ontrol role of users 
public class encapsulation {
    //example of encapsulation
    private String name;
    private int age;
    public encapsulation(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        encapsulation obj=new encapsulation("Shubrata",22);
        System.out.println("Name: "+obj.getName());
        System.out.println("Age: "+obj.getAge());
    }
}
