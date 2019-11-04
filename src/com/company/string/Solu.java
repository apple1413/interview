package com.company.string;

import java.util.ArrayList;
import java.util.List;

class Solu {
    static List<List<Integer>> returnlist= new ArrayList< List<Integer> >();
    public  static  void main(String [] args){
         int [] a={1,2,3};
        permute(a);

    }
    public static  List<List<Integer>> permute(int[] nums) {
         change(nums,0);
        return returnlist;
    }
    public static void change(int[] nums ,int start){
        if(start==nums.length-1){
            ArrayList<Integer> list= new ArrayList<Integer>();
            for(Integer te:nums){
                list.add(te);
            }
            returnlist.add(list);
        }
        for(int i=start;i<nums.length;i++){
            int  temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
            change(nums,start+1);
            temp=nums[i];
            nums[i]=nums[start];
            nums[start]=temp;
        }

    }
}