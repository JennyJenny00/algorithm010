import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println("The array is : ");
        printArray(arr);
        System.out.println("Please input K, k < array.length");
        Scanner myObj = new Scanner(System.in);
        int k = myObj.nextInt(); 
        System.out.println("The top " + k + "elements are:");
        printArray(topKFrequentI(arr, k));
    }
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    public static int[] topKFrequentI(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        //如果b - a > 0 就把b放前面
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }
        List<Integer> res = new ArrayList<>(); 
        while (res.size() < k) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res.stream().mapToInt(i->i).toArray();
    }
    public static int[] topKFrequentII(int[] nums, int k) {
        //创建n+1个桶，每个bucket里面放一个hashmap对应nums[i]->频率
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // 1 - 3, 2-2, 3-1
        List<Integer>[] buckets = new List[nums.length + 1];
        for (Integer i : map.keySet()) {
            int freq = map.get(i);
            if (buckets[freq] == null) {
                buckets[freq] = new LinkedList<>();
            }
            buckets[freq].add(i);
        }
        List<Integer> res = new LinkedList();
        for (int i = nums.length; i >= 0 && k > 0; i--) {
            if (buckets[i] != null) {
                List<Integer> list = buckets[i]; 
                res.addAll(list);
                k-= list.size();
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}