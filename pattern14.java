public class pattern14 {
    public static void main(String[] args) {
        int num=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i==1||i==5||j==1||j==5||i==j||i+j==6||j==5)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
