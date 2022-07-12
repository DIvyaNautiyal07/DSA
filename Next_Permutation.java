import java.util.Arrays;
import java.util.Scanner;

public class Next_Permutation {

    public static int[] findNextPerm(int[] arr){
        int n = arr.length;

        //find infection pt;
        int infpt=0;
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                infpt = i;
                break;
            }
        }

        //if infection pt is 0 that means array is in descending array(lexographically largest) and hence no next permutation exists 
        //so we must return a sorted array(given in question)
        if(infpt==0)
            Arrays.sort(arr);
        else{
            int toSwapIndex = infpt-1;

            //find the next largest element to toSwap number
            for(int i =n-1; i>infpt;i--){
                if(arr[i]>arr[toSwapIndex]){
                    int temp = arr[i];
                    arr[i] = arr[toSwapIndex];
                    arr[toSwapIndex] = temp;
                    break;
                }
            }

            Arrays.sort(arr, infpt, n);
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] res= findNextPerm(arr);

        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }

        sc.close();
    }
}
