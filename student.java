public class student extends human {
    int a;
    student(){
        super();
        this.a=10;
        show();
        //System.out.println("inside student constructor");
    }
    @Override
    void show(){
        System.out.println(a);
        System.out.println("show method of student");
    }
}
