import java.util.*;
public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("nums = [1,2,3]");
        List<List<Integer>> ans = subsets(nums);
        for (List<Integer> l : ans) {
            System.out.println(l);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        dfs(res, nums, 0, new ArrayList<>());
        return res;
    }
    private static void dfs(List<List<Integer>> res, int[] nums, int index, List<Integer> list) {
        res.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(res, nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
    // private static void dfs(List<List<Integer>> res, int[] nums, int index, List<Integer> list) {
    //     if (index == nums.length) {
    //         res.add(new ArrayList<>(list));
    //         return;
    //     }
    //     dfs(res, nums, index + 1, list);
    //     list.add(nums[index]);
    //     dfs(res, nums, index + 1, list);
    //     list.remove(list.size() - 1);
    // }
}