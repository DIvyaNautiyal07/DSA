import java.util.*;

public class Numbers{
   
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);


      //PALINDROME
      //int n = sc.nextInt();
      //palindrome(n);


      //LEADING ZEROES IN A FACTORIAL
      // int n = sc.nextInt();
      // long fact = factorial(n);
      // int count = 0;
      // while(fact%10==0){
      //   count++;
      //   fact/=10; 
      // }
      // System.out.println("No of Leading zeroes " + count);


      //PRIME NUMBERS
      // int n = sc.nextInt();
      // if(isPrime(n))
      //    System.out.println(n+" is a prime no.");
      // else
      //    System.out.println(n+" is not a prime no."); 

      
      //SEIVE ERATOSTHENES- Prime no.s between 1-n
      // int n = sc.nextInt();
      // seive(n);
      
      //GCD
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(gcd(a,b));
      
      sc.close();
   }

   /*public void static palindrome(int n){
      int temp = n;
      int res = 0;
      while(temp>0){
         res = res*10 + temp%10;
         temp/=10;
      }

      if(res == n)
         System.out.println("Palindrome");
      else
         System.out.println("not a palindrome");
   }*/


   /*public static long factorial(int n){
      long fact = 1;

      if(n==0 || n == 1)
         return 1;
      
      for(int i=2;i<=n;i++){
         fact*=i;
      }

      return fact;

   }*/


   /*public static boolean isPrime(int n){
      if(n==0|| n == 1)
         return  false;
      if(n==2)
         return true;

      for(int i=2;i*i<=n;i++){
         if(n%i==0)
            return false;
      }

      return true;
   }*/


   /*public static void seive(int n){
      boolean isPrime[] = new boolean[n+1];
      Arrays.fill(isPrime, true);
      isPrime[0]= false;
      isPrime[1] = false;

      for(int i=2;i*i<=n;i++){
         if(isPrime[i]){
            for(int j=i*i;j<=n;j+=i){
               isPrime[j] = false;
            }
         }
      }

      for(int i=0;i<=n;i++){
         System.out.println(i+"-" + isPrime[i]);
      }

   }*/


   public static int gcd(int a,int b){
      if(b==0)
         return a;
      
      return gcd(b,a%b);
   }

}