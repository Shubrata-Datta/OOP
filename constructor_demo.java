//Like a method but not actually a method
//similar name as class name
// no return type
// two types: parameterized and non-parameterized
//implementing default constructor is optional in java
//constructor overloading decides(at compile time) which constructor to call based on the arguments passed
public class constructor_demo {
    String name;//instance variable
    float cgpa;
    constructor_demo()//default constructor
    {
        System.out.println("Hello!I am a constructor");
        //if I dont use a default constructor it will not create any problem but it is a good practice to use it.
        //By creating constructor we can initialize the object as soon as it is created. 
        
    }
    //when there is no constructor implementing default is optional 
    //but when there are at least one constructor implementing default is mandatory.
    constructor_demo(double a)//parameterized constructor
    {
        System.out.println("The value is:"+a);
    }
    constructor_demo(String s)//parameterized constructor
    {
        System.out.println("The name is:"+s);//constructor signature=constructor name+constructor parameters
        name=s;
    }
    constructor_demo(String s,float a)
    {
        System.out.println("Name is:"+ s+"cgpa is: "+a);
        this.name=s;
        this.cgpa=a;//this keyword is used to refer to the current object instance variable.
    }  
    constructor_demo(int a,String s)
    {
        System.out.println("Value is:"+ a+"Name is: "+s);
    }  
    public static void main(String[] args) 
    {
        constructor_demo c1=new constructor_demo();
        constructor_demo c2=new constructor_demo("Shubrata",3.80f);
        constructor_demo c3=new constructor_demo("Ronaldo",4.0f);
        System.out.println("In main meethod:"+c3.name);
        //if I dont use constructor to initialize name it will print null
        //c1.name="Shubrata";
    
    }

}