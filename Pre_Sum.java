import java.util.Scanner;

public class Pre_Sum {

    /*Range based queries - L to R
  PreSum technique: formula => ans = pre_sum[r] - pre_sum[l-1]
  example:
  	arr[1, 2, 3, 4] => pre_sum[1, 3, 6, 10]
  	L = 1 to R = 3 => 10 - 1 = 9 (Ans)
  	L = 0 to R = 3 => 10 (Ans) (this is an edge case thats why we are checking a condition on line 32)
*/
    
    public static void rangeSum(int q, int n, int[] a){
        //calculate presum
        long[] presum = new long[n+4];
        long sum =0;
        for(int i =0;i<n;i++){
            presum[i]= sum+ a[i];
            sum+=a[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(presum[i]+" ");
        }

        Scanner sc = new Scanner(System.in);

        while(q!=0){
            int l,r;
            System.out.println("Input the queries");
            l = sc.nextInt();
            r = sc.nextInt();
            long ans = presum[r];
            if(l>0){
                ans -= presum[l-1];
            }
            System.out.println("Sum from "+ l +" to " + r + " is: " + ans);
            q--;
        }

        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        rangeSum(q,n,arr);

        sc.close();
       
    }
    
}
