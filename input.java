import java.util.*;
public class input 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //int a;
        // a = sc.nextInt();
        // System.out.println(a);
        // float b = sc.nextFloat();
        // System.out.println(b);
        //String s = sc.nextLine();
        //System.out.println(s);
        //char ch = sc.next().charAt(0);
        int arr[] = new int[5];
        for (int i= 0; i < 5; i++) 
        {
            arr[i]=sc.nextInt();
        }
        for (int i= 0; i < 5; i++) 
        {
            System.out.println(arr[i]);
        }
        System.out.println("Hello "+"World");
    }
}
    

