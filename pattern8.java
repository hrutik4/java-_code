
public class pattern8 {
    public static void main(String[] args) {
        int num=1;
        
        for(int i=1; i<=5; i++)
        
        {
            char ch='a';
            for(int j=1; j<=5; j++)
            {
                if(i%2!=0)
                {
                    System.out.print(num);
                }
                else{
                    System.out.print(ch);
                    ch++;
                }

            }
            System.out.println();
            if(i%2!=0)
            num++;
            // System.out.println(ch);
            // if(i%2==0)
            // ch++;
        }
    }

    
}