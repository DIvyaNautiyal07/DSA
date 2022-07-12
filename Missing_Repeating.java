import java.util.Scanner;


public class Missing_Repeating {

    //TC- O(N)  SC- O(N) {since we are creating another array freq[]} 
    //also numbers will be in the range of 1-n
    /*public static void missingRepeating(int n,int[] arr){
        int freq[] = new int[n+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        for(int i =1;i<=n; i++){
            if(freq[i]==0) System.out.println("Missing-"+ i);
            else if(freq[i]>1) System.out.println("Repeating-"+ i);
        }
    }*/


    //Summation Approach

    //Swap Sort

    //Bit Manipulation Approach

    //Mark it negative - O(N) O(1)
    public static void missingRepeating(int n , int[] arr){
        int x;
        for(int i=0;i<n;i++){
            x  = Math.abs(arr[i])-1;
            if(arr[x]>0)
                arr[x]*=-1;
            else
                System.out.println("Repeating-"+ Math.abs(arr[i]));

        }

        for(int i=0;i<n;i++){
            if(arr[i]>0)
                System.out.println("Missing-" + (i+1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        missingRepeating(n, arr);

        sc.close();
    }
}
