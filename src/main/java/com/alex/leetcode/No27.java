package com.alex.leetcode;

/**
 * 删除元素
 * 给定一个数组nums和一个值val，就地删除该值的所有实例并返回新的长度。
 * 不要分配额外的空间，必须通过使用O（1）额外的内存就地修改输入数组来做到这一点。
 * 元素的顺序可以更改。超出新长度后剩下的顺序无所谓。
 */
public class No27 {
    public static void main(String[] args) {
        int[] ints1=new int[]{3,2,2,3};
        System.out.println("ans"+removeElement(ints1,3));
        int[] ints2=new int[]{0,1,2,2,3,0,4,2};
        System.out.println("ans"+removeElement(ints2,2));
        int[] ints3=new int[]{1};
        System.out.println("ans"+removeElement(ints3,1));
        int[] ints4=new int[]{4,5};
        System.out.println("ans"+removeElement(ints4,5));
    }

    /**
     * 直接插入
     * 将不匹配的值插入指定下标并修改下次下标位置
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement1(int[] nums, int val) {
        int i = 0;
        for (int elem : nums) {
            if (elem != val) {
                nums[i] = elem;
                i++;
            }
        }
        return i;
    }

    /**
     * 从正方向匹配，如果匹配到值
     * 从反方向取一个不匹配的数替换
     * 自己想的，想太多
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int last=nums.length-1;
        for(int i=0;i<=last;i++){
        aloha:
            if(nums[i]==val){
                if(nums[last]!=val){
                    nums[i]=nums[last];
                    last--;
                }else{
                    for (int j=last;j>=i;j--){
                        if(nums[j]!=val){
                            nums[i]=nums[j];
                            last--;
                            break aloha;
                        }else{
                            last--;
                        }
                    }
                }

            }
        }
        for (int num:nums){
            System.out.println(num);
        }
        System.out.println("===");
        return last+1;
    }
}