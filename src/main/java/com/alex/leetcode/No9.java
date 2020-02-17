package com.alex.leetcode;



/**
 * Palindrome Number
 * 确定整数是否是回文。当它向前读取向后时，整数是回文。
 *
 * 例1：
 *
 * 输入： 121
 *  输出： true
 * 例2：
 *
 * 输入： -121
 *  输出： false
 *  说明：从左到右，它显示为-121。从右到左，它变成121-。因此它不是回文。
 * 例3：
 *
 * 输入： 10
 *  输出： false
 *  说明：从右到左读取01。因此它不是回文。
 * 跟进：
 * 你不将整数转换为字符串解决它么？
 * @author alex
 */
public class No9 {

    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 &&x%10==0)){
            return false;
        }
        int y=0;
        //如果x比y小，说明已经处理了总位数多一半或者一半多一位
        while (x>y){
            y=y*10+x%10;
            x=x/10;
        }
        System.out.println(x+" "+y);
        return x==y || x==y/10;
    }
}