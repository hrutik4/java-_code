
public class pattern7 {
    public static void main(String[] args) {
        int num1=1;
        int num2=9;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i==1||i==5||j==1||j==5)
        
                {
                    System.out.print(num1+" ");
                    num1++;
                }
                else{
                    System.out.print(num2+" ");
                    num2--;
                }
            
            }
            System.out.println();
        }
    }
    

}