import java.util.Scanner;
public class Army {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.err.println("Enter the Age");
        int Age=s.nextInt();
        System.out.println("Enter the weight");
        int Weight=s.nextInt();
        System.out.println("Enter the Height");
        double Height=s.nextDouble();
        if((Age>=18)&&(Weight>=56)&&(Height>68.5))
        {
            System.out.println("person is eligible");
        }
        else
        {
            System.out.println("person is not eligible");
        }
    }
    
}
