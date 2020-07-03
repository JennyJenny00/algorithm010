import java.util.*;
public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5, 5, 10, 20};
        System.out.println("The bills are : ");
        for (int i : bills) {
            System.out.print(i + ",");
        }
        System.out.println("And the answer is: " + lemonadeChange(bills));
    }
    public static boolean lemonadeChange(int[] bills) {
        //每次选最小的能满足的,一共就三种情况，可枚举讨论
        int len = bills.length;
        int five = 0;
        int ten = 0;
        for (int i : bills) {
            if (i == 5) {
                five++;
            } else if (i == 10) {
                ten++;
                five--;
            } else {
                if (ten > 0) {
                    ten--;
                    if (five > 0) {
                        five--;
                    } else return false;
                } else {
                    if (five >= 3)
                        five -= 3;
                    else return false;
                }   
            }
        }
        if (five >= 0 && ten >= 0) return true;
        return false;
    }
}