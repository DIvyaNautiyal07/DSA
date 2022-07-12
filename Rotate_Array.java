import java.util.Scanner;

public class Rotate_Array {
    
    //TC-O(N)  SC-O(N) 
    /*public static void leftRotate(int n, int[] arr){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;
    }


    public static void RotateByD(int n, int d, int[] arr){
        for(int i=0;i<d;i++){
            leftRotate(n, arr);
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }*/


    //Optimal Solution TC- O(N) SC- O(1)

    public static void leftRotate(int[] arr, int low, int high){
        int temp;
        while(low<high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    public static void RotateByD(int n, int d, int[] arr){
        leftRotate(arr, 0, d-1);
        leftRotate(arr, d, n-1);
        leftRotate(arr, 0, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        RotateByD(n, d, arr);

        sc.close();
    }
}
