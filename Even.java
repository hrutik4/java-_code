import java.util.Scanner;
public class Even {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        if(a%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
}
