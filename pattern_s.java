public class pattern_s {
    public static void main(String[] args) {
        char ch='a';
        for(int i=0; i<5; i++)
        {
            char ans=(char)(ch+i);
            for(int j=1; j<=5; j++)
            {
                System.out.print(ans+" ");
                ans+=5;
                
            }
            
            System.out.println();
            
            
        }
    }
    
}
