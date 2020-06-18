import java.util.*;
public class nThUglyNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("You will get the n-th ugly number, please enter n :");    
        int n = myObj.nextInt();  // Read user input
        System.out.println("The n-th ugly number is " + nthUglyNumber(n));

    }
    public static int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1; // we need n-1 finally
        int f2 = 2, i2 = 0;
        int f3 = 3, i3 = 0;
        int f5 = 5, i5 = 0;
        for (int i= 1; i < n; i++) {
            int min = Math.min(Math.min(f2, f3), f5);
            dp[i] = min;
            if (min == f2) 
                f2 = 2*dp[++i2];
            if (min == f3)
                f3 = 3*dp[++i3];
            if (min == f5)
                f5 = 5*dp[++i5];
        }
        return dp[n - 1];
    }
}