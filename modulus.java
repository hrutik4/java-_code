import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the lower range:");
        int M=s.nextInt();
        System.out.println("Enter the higher range:");
        int N=s.nextInt();
        // for(int i=M; i<=N; i++)
        {
           System.out.println("modules"+(M/N));
           System.out.println("reminder"+(M%N));
        }

    }
    
}
