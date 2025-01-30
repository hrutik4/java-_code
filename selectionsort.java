public class selectionsort {
    public static void main(String[] args) {
        int[] a={38,57,48,26,47,28,54};
        int temp=0;
        for(int i=0; i<a.length; i++)
        {
            int min=i;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    min=j;
                }
                temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
    
}
