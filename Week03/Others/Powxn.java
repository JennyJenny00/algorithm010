import java.util.*;
public class Powxn {
    public static void main(String[] args) {
        System.out.println("Please input the number of base (double)x :");
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        System.out.println("Please input the power (int) n :");
        int n = myObj.nextInt();
        System.out.println("The result of pow(x, n) is :" + myPow(x, n));
    }
    public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == Integer.MIN_VALUE){
            x = x * x;
            n = n/2;
        }
        if(n < 0) {
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? myPow(x * x, n/2) : x *  myPow(x * x, n/2);
    }
}