import java.util.Scanner;

public class Leaders_Array {
    
    //Optimized Solution O(N)
    public static void leaders(int[] arr){
        int n = arr.length;
        int leader = arr[n-1];
        System.out.println(leader);

        for(int i =n-2; i>=0;i--){
            if(arr[i]>leader){
                leader = arr[i];
                System.out.println(leader);
            }
        }
    }
    
    
    
    //Brute force approach - O(N^2)
    /*public static void leaders(int arr[]){
        int n = arr.length;
        boolean flag = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>=arr[i]){
                    flag = false;
                    break;
                }
            }

            if(flag==true)
                System.out.println(arr[i]);
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        leaders(arr);

        sc.close();
    }
}
