public class RelativeSortArray {
    class Solution {
        Map<Integer, Integer> map;
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            if (arr1 == null) return arr2;
            map = new HashMap<Integer, Integer>();
            for (int i = 0; i < arr2.length; i++) {
                map.put(arr2[i], i);
            }
            List<Integer> list = new ArrayList<>();
            for (int i : arr1) {
                list.add(i);
            }
            Collections.sort(list, new SortByArr2());
            int[] res = list.stream().mapToInt(i->i).toArray();
            return res;
        }
        class SortByArr2 implements Comparator<Integer> {
            public int compare (Integer a, Integer b) {
                Integer va = map.get(a);
                Integer vb = map.get(b);
                if (va == null || vb == null) {
                    if (va == null) {
                        a = a + 1000;
                    } 
                    if (vb == null){
                        b = b + 1000;
                    }
                    return a - b;
                } else return va - vb;
            }
        }
    }
}