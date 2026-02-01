//poly(many) + morphism(forms) = many forms that means one action behaving in different ways
//in java polymorphism allows the same method to perform different tasks
//types of polymorphism-:compile time polymorphism(static binding)->method overloading
//run time polymorphism(dynamic binding)->method overriding
//method overloading->same method name with different parameters in the same class
//method overriding->same method name with same parameters in different classes related through inheritance
//when method is called,java determines which version of the method to execute based on the object type
//upcasting->child class object is assigned to parent class reference variable
//downcasting->parent class object is assigned to child class reference variable
//it is not allowed directly but can be done using explicit casting
//benefit of polymorphism->code reusability,easy to maintain,improves readability,flexibility in code
//example of polymorphism in java
public class polymorphism {
// method overloading example
//     static class MathOperations {
//         //method to add two integers
//         int add(int a, int b) {
//             return a + b;
//         }
//         //overloaded method to add three integers
//         int add(int a, int b, int c) {
//             return a + b + c;
//         }
//         //overloaded method to add two double values
//         double add(double a, double b) {
//             return a + b;
//         }
//     }
//     public static void main(String[] args) {
//         MathOperations math = new MathOperations();
//         System.out.println("Sum of two integers: " + math.add(5, 10));
//         System.out.println("Sum of three integers: " + math.add(5, 10, 15));
//         System.out.println("Sum of two doubles: " + math.add(5.5, 10.5));
//     }
// }
    //method overriding example
//     static class Animal {
//         void sound() {
//             System.out.println("Animal makes a sound");
//         }
//     }
//     static class Dog extends Animal {
//         void sound() {
//             System.out.println("Dog barks");
//         }
//     }
//     public static void main(String[] args) {
//         Animal myAnimal = new Animal();
//         Animal myDog = new Dog();
//         myAnimal.sound();
//         myDog.sound();
//     }
//     //upcasting example
    static class Parent {
        void show() {
            System.out.println("Parent class method");
        }
    }
    static class Child extends Parent {
        void show() {
            System.out.println("Child class method");
        }
    }
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();
        parent.show();
        child.show();
    }
}
//     //downcasting example
//     static class Parent {
//         void display() {
//             System.out.println("Parent class method");
//         }
//     }
//     static class Child extends Parent {
//         void display() {
//             System.out.println("Child class method");
//         }
//         void childMethod() {
//             System.out.println("Child specific method");
//         }
//     }
//     public static void main(String[] args) {
//         Parent parent = new Parent();
//         Parent child = new Child();
//         parent.display();
//         child.display();
//         //downcasting
//         Child actualChild = (Child) child;
//         actualChild.childMethod();
//     }
// }