package com.alex.leetcode;

public class No172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(5));
    }

    /**
     * 假设n=14，则14！实际为：
     * 1*2*3*4*5*6*7*8*9*10*11*12*13*14
     * =================================
     * 在乘法运算里，尾随0的个数=所有因子造成的尾随0个数之和，
     * 例如:
     *  1*2*3*4*5这个乘阶里，2*5=10，而1*3*4或者他们直接任意的组合都不会造成尾随0；
     * 在这里将问题转化为会有多少对因子相乘会造成尾随0
     * =================================
     * 经过进一步分析：
     * 1.造成尾随0的因素是因子本身尾随0或者2*5，此时我们只需要关心10，2，5倍数的因子
     * 2.10本身也是由2，5的倍数，把它分配到2和5的倍数中
     * 3.2的倍数个数（2，4，6，8，10）小于5的倍数个数（5，10）
     * 4.数字有多个少因子是5的倍数，就一定能找出多少个0
     * 在这里将问题转化为1~n之间有多少个5
     * @param n
     * @return
     */
    public static int trailingZeroes(int n) {

       return n>=5?n/5+(trailingZeroes(n/5)):0;
    }

    /**
     * 阶乘函数 n！=1*2*3*4...*n，
     * 用递归表示为f（0）=1；f（n）=f（n-1）*n
     * @param n
     * @return
     */
    public static int findZreos(int n) {
        if(n==0){
            return 1;
        }else {
            return findZreos(n-1)*n;
        }
    }
}