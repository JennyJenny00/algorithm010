Week2-学习笔记
一个关于 HashMap 的小总结。
HashMap 隶属于Map这个抽象类，比较常见的用法有：
-构建一个map的时候要可以用：
map.put(i, map.getOrDefault(i, 0) + 1); 省去了不必要的查看是否存在再+1
-iterate一个map的时候要调用Map.Entry + for 循环 map.entrySet()
eg. for (Map.Entry<Integer, Integer> entry : map.entrySet())

·Monday
✅看完本周课程视频
242. Valid Anagram ✅主要是省掉map的用法
49. Group Anagrams 升级版242. 在自己hash一个string的时候用char[] 不是int[]
1. Two Sum ✅千年老题
Ugly Number系列
263. Ugly Number 判断是不是ugy number ✅ 从2-6挨个除 如果余数为0 就一直除，看最后是不是等于1
264. Ugly Number II ✅🉑谁小移谁+DP Ugly numbers are positive numbers whose prime factors only include 2, 3, 5
Tree 系列
二叉树前中后level遍历，recursive+Iterative
pre ✅✅之前不白练。。居然都一遍过了。。哭了

··Tuesday
589. N-ary Tree Preorder Traversal ✅Iterative + Recursive✅ 一遍过 完美！
 94. Binary Tree Inorder Traversal Iterative ❌🉑 得再写写+ Recursive✅
102. Binary Tree Level Order Traversal ✅ BFS queue 一遍过 完美！
429. N-ary Tree Level Order Traversal✅ 一遍过 完美！

-TODO
明天做heap

···Wednesday
今天把作业交上✅
347. Top K Frequent Elements ✅ 🉑方法1：O(n)bucket sort 第一次写 感觉还是很有意思的，应该是空间换时间的典型。✅🉑方法2:heap 这俩方法为感觉考察的更多的是hashmap的各种超长函数的操作，要背下来。。
912. Sort an Array ✅🉑HeapSort ：实现思路是从后往前处理数组，并且每个数据都是从上往下堆化.就是跟自己的left and right 比较，如果比自己大 就交换，然后再以被交换的点做heapify
            所以在任何情况下都要这样比较一大圈，很稳定的算法， 不存在最好或最坏。
            但是为什么先选一半做heapify？
            因为叶子节点往下堆化只能自己跟自己比较，所以我们直接从第一个非叶子节点开始，依次堆化就行了。

-不太需要重做但是什么时候想做可以做
716. Max Stack ❌跟min像又不一样 问题出在，如果popMax的值在head后面的，删掉后要更新所有前面的node的Max值
239. Sliding Window Maximum ❌难到超出理解 
84. Largest Rectangle in Histogram ❌难到勉强理解 
42. Trapping Rain Water ✅ 抄了两种解法，一个是stack 一个是two pointers的感觉都很妙，希望明天能记住。。
1201. Ugly Number III ❌positive integers which are divisible by a or b or c.跟之前的264是不一样的，要用binary search 而不是pointers 以后再说 🉑

····Thuresday
912. Sort an Array HeapSort ✅第二遍做加深了理解，解答了之前的疑问🉑以后再做
347. Top K Frequent Elements  ✅方法1：O(n)bucket sort 能用这个方法的原因在于出现的频率就是在n的范围内，构建n个桶是可行的。但是不要忘记check桶是不是空。。
✅方法2:heap 
 94. Binary Tree Inorder Traversal Iterative 🉑❌头后入栈，以check当前节点为准，而不是check left是不是为空

·····Friday
23. Merge k Sorted Lists ✅ 🉑priorityQueue加入的是链表 再从每个链表中直接入queue。。感觉这状态差不少。。得加油了
295. Find Median from Data Stream ✅要注意细节，怎么都行的情况下怎么保持前后一致。比如默认如果总数为奇数，那前半段比后半段大一
94. Binary Tree Inorder Traversal Iterative ✅