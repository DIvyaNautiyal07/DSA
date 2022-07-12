import java.util.Scanner;

public class Majority_Element {
    /*public static int findMajorityElement(int n, int[] arr){
        

        //BRUTE FORCE APPROACH

        // int cnt =0;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         if(arr[i]==arr[j])
        //             cnt++;
        //     }

        //     if(cnt>n/2)
        //         return arr[i];
        // }

        // return -1;


       //second approach
        Arrays.sort(arr);
        int i=0;
        int cnt=1;
        while(i<n-1){
            if(arr[i]==arr[i+1]){
                cnt++;
                if(cnt>n/2)
                    return arr[i];
            }else{
                cnt=1;
            }

            i++;
        }

        return -1;

    }*/
    

    public static int mooreAlgo(int n,int[] arr){
        int ansIndex = 0, cnt = 1;
        for(int i=0;i<n;i++){
            if(arr[ansIndex] == arr[i])
                cnt++;
            else
                cnt--;

            if(cnt==0)
                ansIndex = i;
        }

        return arr[ansIndex];
    }

    public static void main(String[] args) {

        
        //element having occurrences greater than n/2

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    
        //System.out.println(findMajorityElement(n,arr));
        System.out.println(mooreAlgo(n,arr)); //Moore's Voting algo for majority element

        sc.close();
    }
}
