public class Evencount1{
    public static int even(int[] arr){
        int n=arr.length;
        int count=0;
        int c=0;
        for (int i = 0; i < n; i++) {
            int k=arr[i];
            while (k>0) {
                count++;
                k /=10;
            }
            if(count%2==0){
                c++;
            }
        }
        return c;
    }

    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {24,256,42,2,3,7856};
        int ans = even(arr);
        System.out.println(ans);
    }
}