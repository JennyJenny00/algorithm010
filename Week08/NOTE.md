学习笔记

·Sunday
居然一转眼就week08了。。震惊。感觉这周任务量不大，是位运算和排序，可以有空把week06的补补
位运算的要点
位运算的比较级在这里列了出来，top to bottom
https://en.cppreference.com/w/c/language/operator_precedence

“
1. 将x最右边的n位清零： x&(~0<<n) <<是4 ~是2 所以先取反 再左移n位得到n个0，再&就清零了
2. 获取x的第n位的值： (x>>n)&1 x右移n位 n右边的数都抹掉，再和0001相与，就得到了只有n位的值
3. 获取x的第n位的幂值： x&(1<<n)
4. 将第n位置为1 ： x|(1<<n) 
5. 将第n位置为0 ： x&(~(1<<n))
6. 将x最高位至第n位（含）清零： x&((1<<n) - 1) 1000 - 1 = 000111
7. 判断奇偶:
    奇数： (x&1) == 1
    偶数： (x&1) == 0
8. 除2运算
    x/2 转化为： x>>1
9. 清零最低位的1： x = x&(x - 1) eg. x = 1001 1000
10. 得到最低位的1： x &(-x)
”
191. Number of 1 Bits ✅在Java中没有无符号数，所以会超， 
"Java uses two's complement for negative numbers and the basic rule is to take the positive, invert all bits then add one"
所以3是 00000000 00000000 00000000 00000011 
取反:   11111111 11111111 11111111 11111100
加1:    11111111 11111111 11111111 11111101 变成 -3 因为1代表负数， 101

>> is arithmetic shift right,也就是 unsigned shift 插入0； 
>>> is logical shift right.对于负数保留前面的负号 也就是一向右移插入的是1
所以这个题里要逻辑右移，保留负号

231. Power of Two ✅ =>转换成 有且仅有一个二进制位是1 就一句话 return n>0 && (n&(n-1))==0;
    特别妙啊，但是我之前比较迷惑的是以为还要转化成binary 但是其实不用，在用&时已经自动转化了 n&(n-1)就是打掉第一个1， 这样如果只剩0 就对了

·Monday
190. Reverse Bits✅ 还是很奇妙的 要注意套路
 方法1 ：从右往左处理， eg 13: 1101 从右开始，是1 那就加1然后挪，循环32次后这个1变成了头，一开始的n不断右移，最终的结果不断左移
方法2: 两头开始处理 left, right 往中间走 感觉会比方法1更快
然后reversePairs
bit mask 是(1 << left) | (1 << right)
把左右两位都设为1， 然后再和自己异或，相同得0，不同得1 就取反了。原来是1 变成0， 原来是0 变成1
                x ^= ((1 << left) | (1 << right));
160. Intersection of Two Linked Lists ✅做着玩玩，好久之前做过，现在都忘了。。链表题还是很好玩的！就是套路比较固定。。
52. N-Queens II ✅抄了一下最佳，很奇妙了 真的是终极解法 用hills and dales也是妙了
338. Counting Bits ✅ dp方程 dp[i] = dp[i<<1] + i&1;
···Tuesday
今天想再理一下脑图，毕竟脑图是学习的进度条。。
太绝望了。。除了tree 别的部分居然没总结。。要命。。
✅添加了190 第二种做法
✅bitMap的脑图整理完毕
✅听完了17课
146. LRU Cache ✅抄了一下 累 明天再来一遍吧
···Wednesday
✅听完了18课
146. LRU Cache 再来一遍 ✅清晰多了！
1122. RelativeSortArray ✅我的妈 这个题可真是够不easy的easy level。锻炼了我写comparator的能力，我不太想用计数排序，因为感觉没法扩展。但是中间又涉及了sort要用list又改list。。这顿折腾 好歹写出来了。
242. Valid Anagram ✅字符串里表达ascii 第一个就用0就好了
····Thu
56. Merge Intervals ✅很喜欢这个题！又复习了一遍写comparator， merge的想法也很好理解