import java.util.*;
public class Combinations {
    public static void main(String[] args) {
        System.out.println("Please input the number n :");
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        System.out.println("Please input the number k :");
        int k = myObj.nextInt();
        List<List<Integer>> ans = combine(n, k);
        for (List<Integer> l : ans) {
            System.out.println(l);
        }
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new ArrayList<Integer>(), 1, k, n);
        return res;
    } 
    private static void dfs(List<List<Integer>> res, List<Integer> cur, int start, int k, int n) {
        if (k == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i <= n - k + 1; i++) {
            cur.add(i);
            dfs(res, cur, i + 1, k-1, n);
            cur.remove(cur.size() - 1);
        }
    }
}