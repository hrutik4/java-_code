public class nonstatic {
    {
        System.out.println("non-ststic block");
    }
    public nonstatic(){
        System.out.println("zero-arg constuctur");

    }
    public static void main(String[] args) {
        new nonstatic();
        System.out.println();
        new nonstatic();
    }
    {
        System.out.println("non-ststic block");
    }

}
