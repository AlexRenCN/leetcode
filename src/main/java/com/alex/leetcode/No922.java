package com.alex.leetcode;

import java.util.Arrays;

public class No922 {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
        //System.out.println(Arrays.toString(sortArrayByParityII(new int[]{3,4})));
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{3,1,4,2})));


    }

    public static int[] sortArrayByParityII(int[] A) {
        int i=0,j=1;
        while (i<=A.length-2 && j<=A.length-1){
            if(A[i]%2==0){
                //不用处理时，下标每次移动两格
                i++;
                i++;
                continue;
            }else {
                int temj=j;
                while (temj<=A.length-1){
                    if(A[j]%2==0){
                        swap(A,i,temj);
                        i++;
                        i++;
                        break;
                    }
                    temj++;
                }
            }
            if(A[j]%2==1){
                //不用处理时，下标每次移动两格
                j++;
                j++;
                continue;
            }else {
                int temi=i;
                while (temi<=A.length-2){
                    if(A[i]%2==1){
                        //swap
                        swap(A,i,temi);
                        j++;
                        j++;
                        break;
                    }
                    temi++;
                }
            }

        }
        return A;
    }
    private static void swap(int[] A,int i,int j){
        A[i]=A[i]+A[j];
        A[j]=A[i]-A[j];
        A[i]=A[i]-A[j];
    }

}