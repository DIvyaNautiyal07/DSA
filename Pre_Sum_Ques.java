import java.util.Scanner;



public class Pre_Sum_Ques {
    /*
Given a binary array consisting 0s and 1s. You need to find out if the elements in the range (L to R) are same either 0 or 1 but consecutive.
like [0 0 0 0] or [1 1 1 1] then you need to print Yes else print No.
*/
    public static void isSame(int q, int n, int[] a){
        //calculate presum
        long[] presum = new long[n+4];
        long sum =0;
        for(int i =0;i<n;i++){
            presum[i]= sum+ a[i];
            sum+=a[i];
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
            
            int numEle = l - r + 1;
            if(ans==0) ////Indicating all no. are 0's
                System.out.println("Yes");
            else{
                if(ans==numEle) //Indicating all no. are 1's
                    System.out.println("Yes");
                else    //Indicating all no. are different
                    System.out.println("No");
            }
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

    isSame(q,n,arr);

    sc.close();
   
}
}
