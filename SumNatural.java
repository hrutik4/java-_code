
import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range");
        int num=s.nextInt();
        int sum=0;
        int product=1;
        for(int i=1; i<=num; i++)
        {
            sum=sum+i;
            product=product*i;
        }
        System.out.println("sum of number"+sum);
        System.out.println("product of number"+product);
    }

    
}