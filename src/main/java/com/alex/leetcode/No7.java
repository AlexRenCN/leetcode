package com.alex.leetcode;
/**
 * Reverse Integer
 * 假设我们正在处理的环境中，
 * 其只能在32位带符号整数的范围内存储的整数：[-2,31,2,31,- 1]，
 * 假设当反向整数溢出时，函数返回0。
 * Example 1:
 *  Input: 123
 *  Output: 321
 *  Example 2:
 * Example 2:
 *  Input: -123
 *  Output: -321
 *  Example 3:
 * Example 3:
 *  Input: 120
 *  Output: 21
 *  @author alex
 */
public class No7 {
    int reverse(int x) {
        int max=Integer.MAX_VALUE/10;
        int min=Integer.MIN_VALUE/10;
        int rev=0;
        while (x!=0){
            int tem=x%10;
            x/=10;
            //如果rev*10+tem溢出
            //可能性1:rev*10+tem>Integer.MAX_VALUE
            //可能性2:rev*10+tem<Integer.MIN_VALUE
            //推导出（Integer.MIN_VALUE/10）≦ rev ≦（Integer.MAX_VALUE-tem/10）
            //再来看最后一位 -2147483648 ≦ （rev*10+tem） ≦ 2147483647
            //推导出-8≦tem≦7
            if(rev>max||(rev==max && tem>7)){
                return 0;
            }
            if (rev < min || (rev == min && tem < -8)) {
                return 0;
            }
            rev=rev*10+tem;
        }
        return rev;
    }
}