import java.util.*;
public class GenerateParentheses {

    public static void main(String[] args) {
        System.out.println("Please input the number of n :");
        Scanner myObj = new Scanner(System.in);
        int k = myObj.nextInt();
        List<String> ans = generateParenthesis(k);
        for (String s : ans) {
            System.out.println(s);
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(n, 0, 0, "", res);
        return res;
    }
    public static void dfs(int n, int left, int right, String s, List<String> res) {
        if (left == n && right == n) {
            res.add(s);
            return;
        }
        if (left < n) {
            dfs(n, left + 1, right, s + '(', res);
        }
        if (right < left) {
            dfs(n, left, right + 1, s + ')', res);
        }
        return;
    }

}