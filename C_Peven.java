import java.util.Scanner;

public class C_Peven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the lower rang");
        int M=s.nextInt();
        System.out.println("Enter the lower rang");
        int N=s.nextInt();
        int sum=0;
        int product=1;
        for(int i=M; i<=N; i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
                System.out.println("sum of even number:"+sum);
            }
            else{
                product=product*i;
                System.out.println("product of odd number:"+product);
            }

        }


    }
}
