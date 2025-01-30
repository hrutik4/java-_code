public class Bubble {
    public static void main(String[] args) {
        int[] a={34,23,67,8,45,};
        for(int i=0; i<a.length; i++)
        {
            for(int j=i=0; j<a.length-1; j++)
            {
                if(a[i]>a[j+1])
                {
                   int temp=a[j+1];
                   a[i]=a[j+1];
                   a[i]=temp;
                   
                }


            }
        }


    }
    
}
