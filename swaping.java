import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number A:");
        int num=s.nextInt();
        System.out.println("enter the number B:");
        int num2=s.nextInt();
        System.out.println("enter the number C:");
        int num3=s.nextInt();
        System.out.println("before swaping A:"+num);
        System.out.println("before swaping B:"+num2);
        System.out.println("before swaping c:"+num3);
        int temp=num3;
         num3=num2;
         num2=num;
         num=temp;
        //  System.out.println("after swaping");
        System.out.println("after swaping A:"+num);
        System.out.println("after swaping A:"+num2);
        System.out.println("after swaping A:"+num3);

    }
    
}