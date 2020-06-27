import java.util.*;
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("Please input the number of steps n :");
        Scanner myObj = new Scanner(System.in);
        int k = myObj.nextInt();
        System.out.println("There are " + climbStairs(k)+" ways to get to the top." ); 
    }
    public static int climbStairs(int n) {
        int[][] q = {{1, 1},{1, 0}};
        int[][] res = pow(q, n);
        return res[0][0];
    }
    private static int[][] pow(int[][] a, int n) {
        int[][] ret = {{1, 0}, {0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(ret, a);
            }
            n >>= 1;
            a = multiply(a, a);
        }
        return ret;
    }
    private static int[][] multiply(int [][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + 
                    a[i][1] * b[1][j];
            }
        }
        return c;
    }
}