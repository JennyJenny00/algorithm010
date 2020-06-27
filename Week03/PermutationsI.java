import java.util.*;
public class PermutationsI {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("nums = [1,2,3]");
        List<List<Integer>> ans = permute(nums);
        for (List<Integer> l : ans) {
            System.out.println(l);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new ArrayList<Integer>(), nums);
        return res;
    }
    private static void dfs(List<List<Integer>> res, List<Integer> cur, int[] nums) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (cur.contains(nums[i])) continue;
            cur.add(nums[i]);
            dfs(res, cur, nums);
            cur.remove(cur.size() - 1);
        }
    }
}