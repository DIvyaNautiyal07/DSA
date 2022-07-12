import java.util.Scanner;

public class Stock_Buy_Sell {

    //Optimized O(N)
    public static int findMaxProfit(int[] arr){
        int n = arr.length;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i =0;i<n;i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }

        return maxProfit;
    }
    
    
    //Brute force approach O(N^2)
    /*public static int findMaxProfit(int[] arr){
        int n= arr.length;
        int maxProfit=0;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i])
                    maxProfit = Math.max(maxProfit, arr[j]-arr[i]);
            }
        }

        return maxProfit;
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxProfit(arr));

        sc.close();
    }
}
