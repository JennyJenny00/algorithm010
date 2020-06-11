学习笔记

Part1
Queue && Deque Summary
-------------------------
Queue作为一直以来很熟悉的一种数据结构，先进先出FIFO结构，我比较习惯用ArrayDeque来实现，比较常见的应用是实现bfs，按照入队顺序处理先到的元素。

Queue(return special value(null)):
-offer() offer at the tail
-poll() poll at the head
-peek() look at the head

如果要实现一个bounded queue可以用circular array实现，需要注意什么怎么区分full和empty的情况

Deque
-offerFirst(), offerLast()
-pollFirst(), pollLast()
-peekFirst(), peekLast()
其中，peek 对应get 不要搞错。。之前有个题看solution以为getFirst 是pollFirst,弄错了。
both isEmpty(), size()

-------------------------
Priority Queue Summary
-------------------------
之前一想到priority Queue 就会想到heap，一想到heap就会想求k-smallest/Largest，想到它在任何情况下的时间复杂度都为O(nlogn), 却忘记了priority queue的“初心”， 作为一种特殊的队列，进队的元素按照一定的顺序重新组织，每次只能操作当前最优的元素。 好处之一是这里相对于普通的队列，加入了很多自定义的元素，可以通过comparator自行定义要比较的feature； 好处之二是只关心想要关心的元素。一旦定义了capacity，那超过的范围可以不做任何操作，节省了不必要的操作。

Part 2
学习心得
·Monday
看视频第三课，刷完
-曾做过的题
283. move zeros 发现新做法，感觉操作比较难记
15. three sums 新做法
70. climbing stairs 关联斐波那契倒是以前没想到。。
206. reverse linked list Recursive+Iterative 提交过四遍，感觉还是记不住，要废
141. linked list cycle easy :>
-新做的
24. swap nodes in pairs 跟reverse异曲同工
11. container with most water 谁小移谁
142. linked list cycleII 怎么停住倒是很艺术，要提笔画画算算才行
-TODO
25. reverse nodes in k-group 乍一看简单，看一眼答案又觉得太麻烦了。。明天再说

··Tuesday
看视频第四课，开启了写文档 写完了 newDeuqe.java
-重做
206. reverse linked list Recursive+Iterative recursive ❌又错了 啊我死了。
142. linked list cycleII ✅完美搞定
24. Swap Nodes in Pairs ✅完美搞定
283. move zeros ❌还是没记住
20. Valid Parentheses ❗️发现新解法 免除了把左右括号放入map中的麻烦
155. stack with min() ❗️惊了，发现神人自己写linked list而不是用两个stack，感觉这个才是真正interviewer想看的能力
-新做
239. Sliding Window Maximum ❌难到超出理解
84. Largest Rectangle in Histogram ❌难到勉强理解
-TODO
25. reverse nodes in k-group 太麻烦了。。明天再说
26. Remove Duplicates from Sorted Array 没做过   + arrayDeduplication系列
9. 	Palindrome Number 做过 看着简单 
189. Rotate Array 做过  这个也有好几个类似的二维数组操作的类型题
21. Merge Two Sorted Lists 做过 不难
88. Merge Sorted Array  做过 不难
66. Plus One 做过 不难
641. Design Circular Deque  没做过 看着就难 
42. Trapping Rain Water 没做过 早有耳闻的难 孩怕
···Wednesday
-重做
283. move zeros ❌ 我怕是个傻子。。昨天熬夜太晚早上脑子也不清晰。所有的操作都是在当一个元素不为0时做的，如果为0则什么也不用做 写好了作业版
15. three sums 抄一遍 ✅重要的是这答案deduplication做的好啊
20. Valid Parentheses ✅
155. stack with min() ✅ 边抄一遍新解法边记，感觉真的是妙
11.  Container With Most Water ❌ 注意是 j-i+1
206. reverse linked list Recursive ❌ 递归的终止条件是自己不为空且下一个也不为空，如果就一个元素也没必要递归！脑子真的坏了。。 Iterative❌ head = next 不是head.next我可能是对这个题有执念，像一个永远背不下来的单词。。
66. plus one 四个月前AC过一次。✅现在想来应该是从末尾开始加一，但是问题在于如果要多一位就要在初始时就申请。只需要分别处理<9 和等于9就行了 如果有进位就新开辟一个数组return
1. Two Sum ✅主要是考察hash操作，一个是要在放之前check是否有其complement在里面，而是给定的数中没有重复，所以key可以是nums[i]
-TODO
239. Sliding Window Maximum 
84. Largest Rectangle in Histogram 
25. reverse nodes in k-group 太麻烦了。。明天再说
26. Remove Duplicates from Sorted Array 没做过   + arrayDeduplication系列
9. 	Palindrome Number 做过 看着简单 
189. Rotate Array 做过  这个也有好几个类似的二维数组操作的类型题
21. Merge Two Sorted Lists 做过 不难
88. Merge Sorted Array  做过 不难
641. Design Circular Deque  没做过 看着就难 
42. Trapping Rain Water 没做过 早有耳闻的难 孩怕

····Thuresday
155. stack with min() ❌ 要注意数据结构的定义，先成员变量，再构造函数




