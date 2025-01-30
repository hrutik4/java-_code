import java.util.Scanner;

public class QutiotentRe {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1=s.nextInt();
        System.out.println("Enter the number:");
        int num2=s.nextInt();
        int count=0;
        while(num1>=num2)
        {
            num1-=num2;
            count++;
        }
        System.out.println("reminder"+num1 );
        System.out.println("qutiotenet"+count);
    }
}
