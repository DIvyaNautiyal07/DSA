import java.util.Arrays;
import java.util.Scanner;

public class Freq_Array {

    //count distinct elements
    /*public static void distinctElement(int n, int[] arr){
        
        int freq[] = new int[n+1];
        Arrays.fill(freq, 0);
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<n;i++){
            if(freq[i]>0)
                System.out.println(i+"-"+freq[i]);
        }
    }*/

    //count distinct alphabets
    public static void distinctAlphabet(int n, char[] str){
        
        int freq[] = new int[26];
        Arrays.fill(freq, 0);
        for(int i=0;i<n;i++){
            freq[str[i]-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]>0){
                char ch = (char) ('a' + i);
                System.out.println(ch+"-"+freq[i]);
            }
                
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.next();
        // }

        // distinctElement(n, arr);

        String str = sc.next();
        char[] ch = str.toCharArray();
        System.out.println(str);
        System.out.println(ch);
        distinctAlphabet(n, ch);
        sc.close();
    }
}
