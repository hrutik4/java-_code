import java.util.Scanner;
public class EvenCount {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the lower range");
        int M=s.nextInt();
        System.out.println("Enter the higher range");
        int N=s.nextInt();
        int count=0;
        for(int i=M; i<=N; i++)
        {
            if(i%2==0)
            {
            System.out.println("number is even number"+"="+i);
            count++;
            }
        }
        System.out.println("count of number is="+count);
        
        
    }
    
    
}
