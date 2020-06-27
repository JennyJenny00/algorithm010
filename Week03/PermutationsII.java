import java.util.*;
public class PermutationsII {
    public static void main(String[] args) {
        int[] nums = {1,1, 2};
        System.out.println("nums = [1,1,2]");
        List<List<Integer>> ans = permuteUnique(nums);
        for (List<Integer> l : ans) {
            System.out.println(l);
        }
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(res, new ArrayList<Integer>(), nums,new boolean[nums.length]);
        return res;
    }
    private static void dfs(List<List<Integer>> res, List<Integer> cur, int[] nums, boolean[] used) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //如果已经用过了或者当前元素跟前一个元素一致且前一个元素还没有使用过？？就什么也不做
            if (used[i] || (i > 0) && (nums[i] == nums[i - 1]) && !used[i - 1] ) continue;
            used[i] = true;
            cur.add(nums[i]);
            dfs(res, cur, nums, used);
            cur.remove(cur.size() - 1);
            used[i] = false;
        }
    }
}