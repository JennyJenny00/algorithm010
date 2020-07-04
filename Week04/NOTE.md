学习笔记
----------------------------------------------------------------------------------
使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方
说明：同学们可以将自己的思路、代码写在学习总结中
----------------------------------------------------------------------------------
这个中间无序的地方指代不明 也没有例子。做不了。

感觉这周的步调更快了。。得多投入些时间了
～Sunday 快速看完了本周的视频。感觉内容太多了。
·Monday
102. Binary Tree Level Order Traversal✅
差点忘记。。还是得勤练。。
level用dfs实现可以一会试试感觉挺新颖
515. Find Largest Value in Each Tree Row✅一毛一样 加深记忆了
22. Generate Parentheses✅再来一遍感觉很奇怪 为什么SB不work用string和array都work？
127. word ladder ❌🉑 强行抄完太难理解太恍惚。。
126. Word Ladder II ❌更加恍恍惚惚。仿佛一样再加个记录就行了？好像又不是那么回事？明天接着做把。。
433. Minimum Genetic Mutation❌🉑 这个跟127word ladder很像 看了半天还是费劲，双端BFS有些复杂 又抄了一遍。。感觉稍微多了些理解
200. Number of Islands ✅完全熟练！一把过！

··Tuesday
今天的任务是搞懂BFS。。

https://labuladong.gitbook.io/algo/di-ling-zhang-bi-du-xi-lie/bfs-kuang-jia 
参考这部分内容得知：
”问题的本质就是让你在一幅「图」中找到从起点 start 到终点 target 的最近距离。“之前对BFS的理解过于片面了 感觉就层次遍历，但是实际上是一个起点到终点的最短路径问题。。
“形象点说，DFS 是线，BFS 是面；DFS 是单打独斗，BFS 是集体行动。···但是空间复杂度高，而 DFS 的空间复杂度较低”

111. Minimum Depth of Binary Tree 之前用了递归和维护一个min的值现在改用BFS方式/ 之前的问题想通了看到这个题应该很自然的想到BFS。妙啊！！感觉这个方式特别棒！！
752. Open the Lock ✅“这就可以抽象成一幅图，每个节点有 8 个相邻的节点，又让你求最短距离，” 传String和传char[]是不一样的
卡在了这：Strings are immutable.	Character Arrays are mutable. 传char[]的话中途可能是被改了，所以再回到前一层就不对了
----------------------------------------------------------------------------------
=双向 BFS 优化
“传统的 BFS 框架就是从起点开始向四周扩散，遇到终点时停止；而双向 BFS 则是从起点和终点同时开始扩散，当两边有交集的时候停止。” 双向更高效 但不过，双向 BFS 也有局限，因为你必须知道终点在哪里，双向 BFS 还是遵循 BFS 算法框架的，只是不再使用队列，而是使用 HashSet 方便快速判断两个集合是否有交集。“单项BFS有可能会在空间上占用过大。
所以双向优化有几个点：
1. 从size小的set开始
2. 用set不用queue，可以快速判断元素是否存在
3. 哈希集合在遍历的过程中不能修改，所以用 新建的temp 存储扩散结果
4.  while 循环的最后交换 q1 和 q2 的内容，所以只要默认扩散 q1 就相当于轮流扩散 q1 和 q2。
----------------------------------------------------------------------------------
752. Open the Lock  双向BFS优化 ✅ 🉑️从90ms 优化到了56 不错
126. Word Ladder II ❌我恍恍惚惚我试图在这个上面加俩list 然鹅不work。放弃again
529. Minesweeper ✅分几步，找相邻的->没有相邻的接着更新周围的八个，明天争取优化一下

···Wednesday
----------------------------------------------------------------------------------
from here:
https://labuladong.gitbook.io/algo/di-ling-zhang-bi-du-xi-lie/dong-tai-gui-hua-xiang-jie-jin-jie

"什么动态规划？动态规划问题的一般形式就是求最值-求解动态规划的核心问题是穷举"
"动态规划的穷举有点特别，因为这类问题存在「重叠子问题」，
如果暴力穷举的话效率会极其低下，所以需要「备忘录」或者「DP table」来优化穷举过程，避免不必要的计算。"
126. Word Ladder II...可能要再战一遍。。解决了这个第九课就全做完了
如果不行也要开始第10课贪心了。

"DP就是贪心？什么问题可以用贪心解决？什么不能
贪心：一条路走到黑，就一次机会，只能哪边看着顺眼走哪边(每次选最优)
回溯：一条路走到黑，无数次重来的机会，还怕我走不出来 (Snapshot View)
动态规划：拥有上帝视角，手握无数平行宇宙的历史存档， 同时发展出无数个未来 (Versioned Archive View)"
----------------------------------------------------------------------------------
322. Coin Change ❌🉑️感觉是最基本的DP问题。不知道老师为啥要放在贪心里讲？？迷惑我？？
860. Lemonade Change✅🉑贪心 要枚举所有的情况，在20块钱的时候如果十块钱有剩余优先选择10块钱。
122. Best Time to Buy and Sell Stock II ✅🉑啥玩意。。又一个与DP无关的。。感觉如果最优解不是当前所学的算法，为啥要强行使用，为了练习而用感觉很不好。
455. Assign Cookies✅🉑是很好的贪心算法的题
874. Walking Robot Simulation👎🏻 这个题没意义 misleading 但是这个怎么用一维数组+辅助的direction 表示一个二维数组是个好方式。
55. Jump Game  ✅ 从前往后从后往外都行🉑
45. Jump Game II 代码真是短 就是有点难理解了。。🉑
        就是每次找最大的距离跳，当下一次在这一次的尽头 就再跳
····Thursday 
704. Binary Search✅先来一遍基础
367. Valid Perfect Square ✅找了老半天不同 感觉快疯了 但是发现了问题！ 注意怎么避免overflow和如何check，binary search就不要写else！ 把所有的情况都展开最好
69. Sqrt(x)✅要注意用除代替乘 不要overflow 
33. Search in Rotated Sorted Array✅感觉先找到断点 然后预处理好left 和right 在具体的binary search里就可以按原来的路子走了特别好。
·····Friday ⏸休息
······Saturday
153. Find Minimum in Rotated Sorted Array ❌是之前的33的其中的一个function 之前没有注意 这次发现，必须用while (left < right) right = mid;因为
“nums[mid] > nums[mid + 1] Hence, mid+1 is the smallest.
nums[mid - 1] > nums[mid] Hence, mid is the smallest.” 细节是魔鬼。。
74. Search a 2D Matrix ✅感觉快被逼疯。。一看到2D array的题就很烦躁..就是要很细心！
 
