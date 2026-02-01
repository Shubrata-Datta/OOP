public class child extends parent {
    //int money_amount = 20000;
    child (){
        this(50000);
    }
    child (int a)
    {
      //this.money_amount=a;
      super(a);
    }
    void m3(){
    System.out.println("Inside child method");
    } 
    void m(){
    System.out.println("m Inside child method");
    }
    public static void main(String[] args){
        //child c = new child();
        //c.m3();
        //parent p = new parent();
        // c.m2();
        // c.m1();
        //c.m();// it will call the method of child class due to method overriding
        //but if i have to use the parent or grandpa class method then i have to use super keyword
        //parent class canot access the child class methods
        //System.out.println(c.money_amount);
        //System.out.println(c.money_amount);//it will print parent class money_amount
        // grandpa g = new grandpa(300000);
        // System.out.println(g.money_amount);
        child c = new child();
        System.out.println(c.money_amount);


    }
}
