import java.util.Scanner;

public class swapingadd {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number A:");
        int a=s.nextInt();
        System.out.println("enter the number B:");
        int b=s.nextInt();
        System.out.println("enter the number C:");
        int c=s.nextInt();
        System.out.println("before swaping A:"+a);
        System.out.println("before swaping B:"+b);
        System.out.println("before swaping c:"+c);
        int d;
        d=a+b+c;
        a=d-(a+b);
        b=d-(a+b);
        c=d-(a+b);

        //  System.out.println("after swaping");
        System.out.println("after swaping A:"+a);
        System.out.println("after swaping b:"+b);
        System.out.println("after swaping c:"+c);

    }
    
}