import java.util.Scanner;

public class BinarySearch {

    //O(logN)

    /*public static int search(int n, int[] arr,int m){
        int low=0,high=n-1;
        while(low<=high){
           
            int mid = (low+high)/2;

            if(arr[mid]==m)
                return mid;
            else if(arr[mid]<m)
                low = mid+1;
            else 
                high = mid-1;
        }

        return -1;
    }*/

    public static int search(int n, int[] arr,int m){
        int low=0,high=n-1;
        while(high-low>1){
           
            int mid = low+ (high-low)/2;
            if(arr[mid]<m)
                low = mid+1;
            else 
                high = mid;
        }

        if(arr[low] == m)
            return low;
        else if(arr[high]==m)
            return high;
        else
            return -1;
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        System.out.println(search(n,arr,m));

        sc.close();
    }
}
