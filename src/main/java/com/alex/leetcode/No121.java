package com.alex.leetcode;

public class No121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{1, 2}));
    }

    //public static int maxProfit(int[] prices) {
    //    int ans = 0;
    //    if (prices.length == 0) {
    //        return ans;
    //    }
    //    int bought = prices[0];
    //    for (int i = 1; i < prices.length; i++) {
    //        if (prices[i] > bought) {
    //            if (ans < (prices[i] - bought)) {
    //                ans = prices[i] - bought;
    //            }
    //        } else {
    //            bought = prices[i];
    //        }
    //    }
    //    return ans;
    //}

    public static int maxProfit(int[] prices) {
        int i=0,j=0;
        for(int k=1;k<prices.length;k++){
            i=Math.max(0,i+=prices[k]-prices[k-1]);
            j=Math.max(i,j);
        }
        return j;
    }


    //public static int maxProfit(int[] prices) {
    //    if (prices.length < 2) {
    //        return 0;
    //    }
    //    int res = 0, min = prices[0], max = min;
    //    for (int i = 0; i < prices.length - 1; i++) {
    //        int tem = prices[i + 1];
    //        if (min > tem) {
    //            min = tem;
    //            max = min;
    //            continue;
    //        }
    //        if(tem>max){
    //            max=tem;
    //            if(max-min>res){
    //                res=max-min;
    //            }
    //        }
    //    }
    //    return res;
    //}

}