import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lower range:");
        int M = s.nextInt();
        System.out.println("Enter the higher range:");
        int N = s.nextInt();
        
        for (int i = M; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {  // Prime numbers have exactly two divisors
                System.out.println(i);
            }
        }
        
        s.close();
    }
}
