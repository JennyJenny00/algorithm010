学习笔记

==Part1
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

==Part 2
学习心得
·Monday
看完视频第三课
-做过的题
283. move zeros ✅发现新做法，感觉操作比较难记
15. three sums ✅发现新做法
70. climbing stairs ✅关联斐波那契倒是以前没想到。。
206. reverse linked list Recursive+Iterative ❌提交过四遍，感觉还是记不住，要废
141. linked list cycle easy :>✅
-新做的
24. swap nodes in pairs ✅ 跟reverse异曲同工
11. container with most water ✅谁小移谁
142. linked list cycleII ✅怎么停住倒是很艺术，要提笔画画算算才行
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
-TODO⏸
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
84. Largest Rectangle in Histogram  ✅抄好 再次体会 每次求的是poll出来的index和再peek的index之间的面积
21. Merge Two Sorted Lists ✅完美搞定iterative写法，不过遇到Linked List可以先思考递归解法 明天可以默一下递归版
88. Merge Sorted Array ✅不要忘记postprocess
9. Palindrome Number ✅ 拆出int每一位的操作要熟练
25. reverse nodes in k-group ✅抄完 这个reverse 操作真是妙，先把后半部分的头找到，然后从后往前依次扭转
 ListNode next = tail.next.next;
                tail.next.next = prev.next;
                prev.next = tail.next;
                tail.next = next;
26. Remove Duplicates from Sorted Array ✅跟 283. movezeroes很像 bn
189. Rotate Array ✅这个跟557. Reverse Words in a String III很像，先整体翻转再单独翻转就会得到想要的结果
        k %= nums.length;
注意预处理这个K
-TODO
242. Valid Anagram 做过 预习要重做
94. Binary Tree Inorder Traversal 做过 预习要重做
239. Sliding Window Maximum 要二刷
作业差两题：
641. Design Circular Deque  
42. Trapping Rain Water 

.....Firday
622. Design Circular Queue ✅看到评论说类似就先抄一遍这个 再照着推一下 641. 感觉异曲同工，不过就是多两个function
641. Design Circular Deque花了很久时间。。感觉比622难理解很多不知道是不是自己状态不太对。不能很好的理解。
242. Valid Anagram ✅可以进一步优化，使小于0就直接返回，居然还不需要check空的情况。。
42. Trapping Rain Water ✅抄了两种解法，一个是stack 一个是two pointers的感觉都很妙，希望明天能记住。。
239. Sliding Window Maximum 要二刷

Sunday Summary
共 24题 今天重做以下带🉑️的， 共14题

283. move zeros🉑 ❌又错了。。j在任何情况下都要++ ！
26. Remove Duplicates from Sorted Array ❌窒息 以后需要再做一遍 🉑️
15. three sums 🉑️ 还是得先读题，总是忘记deduplication！这个得deduplication做的特别好 总是忘记
70. climbing stairs 🉑 还是不熟练不用数组的DP，求几就从几开始！1137. N-th Tribonacci Number 一毛一样
206. reverse linked list Recursive+Iterative 🉑出现了奇迹❗️我居然两种写法都一遍写对了！
25. reverse nodes in k-group ✅🉑️ 以后可以再做一遍。。需要深入人心。。
11. container with most water ✅谁小移谁🉑 就算不是排好序的也是谁小移谁，因为这样才有可能变大？
142. linked list cycleII ✅
155. stack with min() 🉑 ✅ 
622. Design Circular Queue ✅ 🉑️ 环形的重点在于在增减index时要取模计算！
641. Design Circular Deque 🉑️✅这回再默一遍感觉理解多了些 还是不知道为什么第一个两个指针都从-1开始 第二个一个从0一个从-1开始

239. Sliding Window Maximum ❌难到超出理解 
84. Largest Rectangle in Histogram ❌难到勉强理解 
42. Trapping Rain Water ✅ 抄了两种解法，一个是stack 一个是two pointers的感觉都很妙，希望明天能记住。。

242. Valid Anagram ✅可以进一步优化，使小于0就直接返回，居然还不需要check空的情况。。
20. Valid Parentheses ❗️发现新解法 免除了把左右括号放入map中的麻烦
66. plus one 四个月前AC过一次。✅现在想来应该是从末尾开始加一，但是问题在于如果要多一位就要在初始时就申请。只需要分别处理<9 和等于9就行了 如果有进位就新开辟一个数组return
1. Two Sum ✅主要是考察hash操作，一个是要在放之前check是否有其complement在里面，而是给定的数中没有重复，所以key可以是nums[i]
21. Merge Two Sorted Lists ✅完美搞定iterative写法，不过遇到Linked List可以先思考递归解法 明天可以默一下递归版
88. Merge Sorted Array ✅不要忘记postprocess
9. Palindrome Number ✅ 拆出int每一位的操作要熟练
189. Rotate Array ✅这个跟557. Reverse Words in a String III很像，先整体翻转再单独翻转就会得到想要的结果
        k %= nums.length;
注意预处理这个K 
-TODO
716. Max Stack ❌跟min像又不一样 问题出在，如果popMax的值在head后面的，删掉后要更新所有前面的node的Max值


