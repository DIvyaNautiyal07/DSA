import java.util.Scanner;
public class NthRoot {
    //using binary search
    public static void findNthRoot(int n,int m){
        double low = 1,high = m;
        double eps = 1e-6;

        while(high-low>eps){
            double mid = (high+low) / 2.0;
            if(mul(mid,n) < m)
                low = mid;
            else 
                high = mid;
        }

        System.out.println(low+" "+high);
    }

    public static double mul(double num, int n){
        double ans = 1.0;
        for(int i=1;i<=n;i++){
            ans*=num;
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        findNthRoot(n,m);

        sc.close();
    }
}
