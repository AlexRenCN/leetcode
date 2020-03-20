package com.alex.leetcode;

public class No717 {
    public static void main(String[] args) {
        //true
        System.out.println(isOneBitCharacter(new int[]{1,0,0}));
        //false
        System.out.println(isOneBitCharacter(new int[]{1,1,1,0}));
        //false
        System.out.println(isOneBitCharacter(new int[]{1,0}));
        //false
        System.out.println(isOneBitCharacter(new int[]{0,1,0}));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        if(bits[bits.length-1]==1){
            return false;
        }
        int carry=bits[0];
        for(int i=1;i<bits.length-1;i++){
            if(bits[i]==1 && carry==0){
                carry=bits[i];
            }else{
                carry=0;
            }
        }
        return carry==0;
    }

}