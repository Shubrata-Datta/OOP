//theory of inheritance in java->
//inheritance->one class takes properties and behaviours from another class
//basic terms-:parent class->super class->base class
//child class->sub class->derived class
//benefit of using heritence->code reusability,easy to maintain,builds hierarchical relationships
//inheits methods and variables of parent class
//types of inheritance-:single inheritance,multilevel inheritance,hierarchical inheritance
//java does not support multiple inheritance through classes to avoid ambiguity,but supports through interfaces
public class inheritence {
    //parent class
    static class Animal 
    {
        void eat() 
        {
            System.out.println("This animal eats food.");
        }
    }
    //child class
    static class Dog extends Animal 
    {
        void bark() 
        {
            System.out.println("The dog barks.");
        }
    }
    //main method
    public static void main(String[] args) 
    {
        Dog dog = new Dog();
        dog.eat(); //inherited method from Animal class
        dog.bark(); //method from Dog class
    }

}
