import java.util.Scanner;

public class Trapping_Rainwater {

    //Brute force approach- in every iteration calculate max height from left and right for each element and then find water trapped O(N^2)

    //Using auixiliary arrays left and right
    //precompute the left max and right max for each element beforehand - O(N) space- O(N)
    /*public static int findTrappingRainwater(int n, int[] arr){
        int ans=0;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        right[n-1] = arr[n-1];

        for(int i=1;i<n;i++){
            left[i]= Math.max(left[i-1], arr[i]);
        }

        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }

        //finding trapped water
        for(int i=0;i<n;i++){
            ans+= Math.min(left[i], right[i]) - arr[i];
        }
        return ans;
    }*/


    //TWO POINTER APPROACH- optimized approach- without using auixiliary space- O(N) O(1)

    public static int findTrappingRainwater(int n, int[] arr){
        int ans=0;

        int left=0, right = n-1;
        int leftMax = arr[0], rightMax = arr[n-1];

        while(left<=right){
            //find which is limiting block - left or right?
            if(leftMax<rightMax){
                //is current height > left max height so water will spill hence no water stored and update left max height to current height
                if(arr[left]>leftMax)
                    leftMax = arr[left];
                //current block height is less than leftMax so water stored will be left max height - current height of building
                else
                    ans+= leftMax-arr[left];
                
                left++;
            }

            else{ //write mirror conditions

                if(arr[right]>rightMax)
                    rightMax = arr[right];
                else
                    ans+= rightMax - arr[right];

                right--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    
        System.out.println(findTrappingRainwater(n,arr));
    
        sc.close();
       
    }
}
