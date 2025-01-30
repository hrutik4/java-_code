import java.util.Scanner;
public class gratestnumber {
    public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a=s.nextInt();
    System.out.println("enter the value of b");
    int b=s.nextInt();
    System.out.println("enter the value of c");
    int c=s.nextInt();
    System.out.println("enter the value of d");
    int d=s.nextInt();
    System.out.println("enter the value of e");
    int e=s.nextInt();
    int ref=(a > b) ? (a > c) ? (a > d) ? (a > e ? a : e) : (d > e ? d : e) : (c > d) ? (c > e ? c : e) : (d > e ? d : e)
     : (b > c) ? (b > d) ? (b > e ? b : e) : (d > e ? d : e) : (c > d) ? (c > e ? c : e ) : (d > e ? d : e); 
    System.out.println("greatrest amoung 5 number is:"+ref);
}
}
