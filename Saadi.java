import java.util.Scanner;
public class Saadi {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the person age:");
        int age=s.nextInt();
        if (age>=18) {
            System.err.println("Person is eligile");
        } else {
            System.err.println("Person is not eligile");
        }
    }
}
