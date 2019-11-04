package com.company.string;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static  void main(String [] args){
      String s="abcdef";
        Permutation(s);

    }
    // 132ms 1186K
    public static  ArrayList<String> Permutation(String str) {
       ArrayList<String> list = new ArrayList<>();
        if(str == null || str.length() == 0)
            return list;
        char[] strArr = str.toCharArray();
        permu(list, strArr, 0);
        Collections.sort(list);
        return list;
        
    }
    
    private static  void permu(ArrayList<String> list, char[] strArr, int start) {


        // 递归终止条件
        if(start == strArr.length-1){
            String result = String.valueOf(strArr);
            // indexOf() 返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
            // 因为可能有字符重复，所以要做此判断
            if(list.indexOf(result) < 0){
                list.add(result);
            }
        }
        for(int i = start; i < strArr.length; i++) {
            char temp = strArr[start];
            strArr[start] = strArr[i];
            strArr[i] = temp;
            
           permu(list, strArr, start+1);
            
            temp = strArr[start];
            strArr[start] = strArr[i];
            strArr[i] = temp;
        }
    }
}
