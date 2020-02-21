package com.alex.leetcode;

public class No167 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,7,11,15},9));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while (i<j){
            if(numbers[i]+numbers[j]<target){
                i++;
            }else if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                System.out.println(i+""+j);
                return new int[]{i++,j++};
            }
        }
        return null;
    }

}