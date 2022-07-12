//import java.util.Arrays;
import java.util.Scanner;


public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        //1------ARRAY SORTED OR NOT-------
       // System.out.println(isSorted(n,arr));     

        
        //2-----REVERSE AN ARRAY------
        // int[] revArr = isReversed(n,arr);
        // for(int i=0;i<n;i++){
        //     System.out.println(revArr[i]);
        // }
        
        
        //3----Largest Element in an arr-------
        //System.out.println(findMax(n,arr));


        

        
        
        sc.close();
    }


    /*public static boolean isSorted(int n, int[] arr){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }*/


    /*public static int[] isReversed(int n, int[] arr){
        int low=0, high=n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

        return arr;
    }*/


    /*public static int findMax(int n, int[] arr){
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max)
                max = arr[i];
        }

        return max;
    }*/


    


 

}