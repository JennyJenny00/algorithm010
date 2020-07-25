学习笔记
周一周二 周三听了13，14课
感觉是实践中用的多的可是上学的时候没怎么学过的内容。这时候正好补上了非常棒。
···Wednesday
病好多了 能起来走路做些简单的事情了，也不能放弃学习呀。12周的课糊弄了过去，日后要找时间补上，那么关键的课。
208. Implement Trie (Prefix Tree) ✅抄写一遍 多加一个找前缀的函数，如果可以一直找 那就一直挪，一旦为空就说明没有了就返回false。
212. Word Search II ✅太酷了 抄了一遍最佳答案 
 我感觉时间复杂度分析的比较靠谱是下面这个，首先。预处理：buildTrie 的复杂度是，XY；
 然后4-child DFS traversal 肯定要以4为底的N*M次方开头，
“
let:
N = num of rows
M = num of columns
X = number of words in dictionary
Y = length of longest word in dictionary

Time complexity of using a set instead of a trie tree

We are doing a 4-child DFS traversal of depth N*M (worst case is traversing entire board). -> 4^(NM)
We are doing this N*M times since we need to check for words starting at each position in the board
-> O(4^(NM)*NM)
Time complexity of using the trie tree

We are doing a 4-child DFS traversal.
The worst case depth in this case is the minimum of [traversing the entire board, traversing until we hit the end of a word].
-> O of each traversal is4^(min(Y, NM))
Note: min accounts for the case where we have words in the dictionary longer than the number of characters in the board itself.
We are doing this N*M times since we need to check for words starting at each position in the board
-> O(4^(min(Y, NM))*NM)” --- from aaardvark

547. Friend Circles 抄了一下最佳答案，但是觉得find函数有问题，还是parent[p] = find(parent[p]);更好

····Thuresday
刚完成了一个mock：
1360. Number of Days Between Two Dates ✅终于面对了自己的恐惧哈哈，抄了一下最佳答案才发现其实很简单的，逻辑清晰，先查年（判定闰年），再查月，超过了2月看当前年是不是闰年 又搞定了类似的1154
1154. Day of the Year ✅
1428. Leftmost Column with at Least a One ✅感觉反应还挺快的一下就判定是binary search 就是interface 在入口前要判定数据有效比较重要。。看了最佳感觉用ans mark一下最终的res会比check边界有效
547. Friend Circles ✅再来一遍 加深理解
130. Surrounded Regions ❌抄都难以理解。。感觉有点懵圈，明天再来一遍吧。
不太爱做题了就听完了15课 感觉很奇妙。
·····Friday
再来一遍 130✅其实就是先mark一下边界的O然后再union里面 再来一层看是不是跟边界O连着 如果没有就flip

进入14课！
今天完成14课的题
各种棋类复杂度https://en.wikipedia.org/wiki/Game_complexity 感觉很有意思
51. N-Queens 经典例题。这么多年过去了迈过恐惧不容易。。抄了下比较好的答案，感觉很巧妙，尤其是对角线的处理，还不是特别明白，可以再看看。稍稍改了下结果，不错。✅
36. Valid Sudoku 抄了秃头哥奇妙的做法！震惊了✅