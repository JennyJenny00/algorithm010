学习笔记
作业：
77. Combinations✅
46. Permutations✅
47. Permutations II✅
236. Lowest Common Ancestor of a Binary Tree✅
105. Construct Binary Tree from Preorder and Inorder Traversal✅
·Monday 
看上课视频。
初学递归的时候感觉这种反直觉的思想非常难理解，但是后来用多了感觉非常省事。你不要理解具体怎么实现的，只要告诉它每次要做什么。什么时候开始，什么时候结束。像个洗衣机似的，他就自动给你了结果。很奇妙。要训练自己这种不要事无巨细的“人肉递归”思想。递归是一种算法的实现方式，回溯，枚举，贪心，dp, 分治都是算法思想。
70. Climbing Stairs ✅前三种思想都理解并写过了，一直惧怕的矩阵乘法根据youtube 视频学了学。勉强理解。。
22. Generate Parentheses✅ 中左右的感觉
··Tuesday
50. Pow(x, n)✅注意corner case 在最小的时候INTEGER_MIN 是-2147483648，INTEGER_MAX是2147483647如果先取负的就会overflow
78. Subsets ❌🉑理都懂。。就是还得多练习,两种做法，一个是选择加或不加，语法上比较好理解，第二中是先加入final result 然后再从当前index开始循环，加，dfs,remove
90. Subsets II containes duplicates ✅🉑得先排序然后才好deduplicate
46. Permutations ❌🉑终止条件是cur==nums.length,不需要keep index 因为每次都是从头开始，判断是否已经包含当前元素，如果没有就加入感觉比较难理解。之前是用swap的方式做的有些固有印象在里面，明天要再理解理解。
47. PermutationsII ❌🉑 在原有框架上加了deduplication 用一个used array标记用过的数 感觉还是很难理解。。
77. Combinations ❌🉑感觉今天状态不是很好。。很难理解这些似的。。得重新做
236. Lowest Common Ancestor of a Binary Tree ❌🉑差一点，判断左右子树的时候只要不同时都为空（说明没找到）就可以返回其中之一

···Wednesday
22. Generate Parentheses✅ 相当于2*n个cell 是放哪个元素，一共俩，left or right, 不需要循环整个list并在进入递归的条件中已经加入了限制 
78. Subsets ✅🉑没有递归终止条件？直接加入res,然后进入循环，每次从当前的index开始
90. Subsets II ❌🉑 要注意if (i > index && nums[i] == nums[i - 1]) continue;i 不能 >0, 要大于index，i-1也会大于index，不然就不在范围内了
46. Permutations ❌🉑判重，等于nums.length时停下
47. PermutationsII ❌🉑 so close!! used 也要recover
77. Combinations✅ 注意循环的时候不是 i <= n 是int i = index; i <=  n - k + 1;慢好多 
39. Combination Sum ✅🉑一样的套路 但是由于是可以重复使用同样的元素，不需要判重，不需要把level++
40. Combination Sum II ❌🉑差一点！ if (i > index && c[i] == c[i - 1]) continue; 会有重复元素要判重！
131. Palindrome Partitioning ❌🉑只有在是palindrome的情况下再加别的元素才有可能还是palindrome，所以在isPalindrome后再进入dfs
17. Letter Combinations of a Phone Number 🉑❌注意dfs循环的条件，是循环数字对应的每个元素，而不是每个数字
4. Median of Two Sorted Arrays🉑❎抄了一道题玩 感觉解法真的是binary search登峰造极的应用
169. Majority Element ✅🉑投票法很cool！值得重新理解
98. Validate Binary Search Tree ✅用Integer null来解决corner case 当等于的时候也算是。。这题出的。。

····Thursday
111. Minimum Depth of Binary Tree ❌🉑不为空才参与计算 不然不参与，每次更新min的值
104. Maximum Depth of Binary Tree ✅一毛一样 但不需要判空
105. Construct Binary Tree from Preorder and Inorder Traversal
226. Invert Binary Tree ✅ like a treenode swap

·····Friday again
297. Serialize and Deserialize Binary Tree🉑✅
ArrayDeque 不允许空值， 要用linked-list，也对 array 咋能允许空值。得是List Node。真的是，deserialize 也用level order实在是高啊！咋来的咋回去
105. Construct Binary Tree from Preorder and Inorder Traversal ✅🉑二刷感觉好理解多了。明显有了更深的理解，左右边界也更好找了！
606. Construct String from Binary Tree❌🉑看起来挺复杂，其实递归起来贼简单。。真的是一个很好的题！怎么这么多人点👎？一定要做多遍 很好的思路！
······SATURDAY
回溯一下本周做的题：
--
39. Combination Sum ✅🉑
40. Combination Sum II ❌🉑
17. Letter Combinations of a Phone Number 🉑❌
90. Subsets II ❌ 一定要注意deduplication 要先sort！ 不然相同的数咋能挨着呢。。
78. Subsets ✅一遍做对哩！但是终止条件是没有的 写的时候也迟疑了果真不该有
46. Permutations ❌🉑判重，等于nums.length时停下
47. PermutationsII ❌🉑 so close!! used 也要recover
77. Combinations✅ 注意循环的时候不是 i <= n 是int i = index; i <=  n - k + 1;慢好多 
--
169. Majority Element ✅🉑
297. Serialize and Deserialize Binary Tree🉑✅
111. Minimum Depth of Binary Tree ❌🉑

105. Construct Binary Tree from Preorder and Inorder Traversal ✅🉑

-TODO
数独、八皇后、0-1 背包、图的着色、旅行商问题、全排列✅等等
69. Sqrt(x)
    I have seen many variants using Binary Search, the key difference is the search range. It seems easy to do it but actually there are some traps we need to take care. I made this just for a note for me.
Search range summary:

[1, Integer.MAX_VALUE](easy but not recommend, since you are not showing the use of your brain)
[1, x](recommend, no math needed)
[1, x/2](you need to do math to prove it: x/2 should include the sqrt(x), i.e. (x/2)^2 >= x, then x >= 4. Easy but I prefer to avoid math during interview, and this must be included as the corner case)
For case 2 and case 3, the point I want to emphasize is how to deal with the corner cases? We need to take care of corner cases by making sure right >= left for [left, right], so:
2. x >= 1 for [1, x] => so we need to take care of the corner case: x < 1
3. x/2 >= 1 for [1, x/2]=> x >= 2 => so we need to take care of the corner case: x < 2