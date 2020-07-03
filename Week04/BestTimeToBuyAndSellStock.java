import java.util.*;
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] bills = {5, 5, 10, 20};
        System.out.println("The prices are : ");
        for (int i : bills) {
            System.out.print(i + ",");
        }
        System.out.println("\nAnd the answer is: " + maxProfit(bills));
    }
    public static int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                res += prices[i] - prices[i - 1];
        }
        return res;
    }
}