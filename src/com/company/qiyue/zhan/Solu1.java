package com.company.qiyue.zhan;

import java.util.Stack;

/**
 * 例1 给定一些元素的入栈顺序和出栈顺序，问是否可能？（假设所有元素都不相同）
 */
public class Solu1 {
    public static  void main(String [] args){
        int a[]={1,2,3,4,5};
        int b[]={2,1,5,4,3};
       // isPossible(a,b);
       System.out.println(isPossible(a,b));
    }
    public static Boolean isPossible(int a[],int b[]){
//       Stack<Integer> stack= new Stack<Integer>();
//      // int i=a.length,j=b.length;
//        int j=0;
//       for(int i=0;i<a.length;i++){
//           stack.push(a[i]);
//           while(!stack.isEmpty()||stack.peek()==b[j]){
//             //  if(i>=stack.size())return  false;
//               stack.pop();
//               j++;
//           }
//
//       }
//
//
//       return  stack.isEmpty();
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int i=0;i<a.length;i++){
            stack.push(a[i]);
            while(!stack.empty()&&stack.peek()==b[j]){
                stack.pop();
                j++;
            }
        }
        return stack.empty();

    }
}
