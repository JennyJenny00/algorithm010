import java.util.*;
public class PlusOne {
    public static void main(String[] args) {
        int[] num = {1, 0,3,9};
        System.out.println("before ");
        for (int i : num) {
            System.out.print(i);
        }
        int[] res = plusHelper(num);
        System.out.println("\n after ");
        for (int i : num) {
            System.out.print(i);
        }

   } 
   public static int[] plusHelper(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0]=1;
        return res;
    }
}