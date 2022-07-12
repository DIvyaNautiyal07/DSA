import java.util.Scanner;

public class Max_Subarray_Sum {

    //Brute force approach O(N^3)
    /*public static int maxSubArray(int n, int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum =0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
               }
               if(sum>max) max = sum;
            }
        }

        return max;
    }*/


    //Optimized Sol- O(N^2)
    /*public static int maxSubArray(int n, int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int currSum =0;
            for(int j=i;j<n;j++){
                currSum += arr[j];
                if(currSum>maxSum) maxSum = currSum;
            }
        }
        return max;
    }*/


    //KADANE'S ALGORITHM -- O(N)
    public static int maxSubArray(int n, int[] arr){
        int currSum =0;
        int maxSum = arr[0]; 
        for(int i =0; i<n ; i++){
            currSum += arr[i];
            if(currSum<0) currSum = 0;
            if(currSum > maxSum) maxSum = currSum;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        
        System.out.println(maxSubArray(n, arr));

        sc.close();
    }
}
