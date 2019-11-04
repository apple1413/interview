package com.company.weiyunsuan;

public class Weiyunsaun {

    /**
     * 位移代替乘法  左移n位相当于该数乘以2^n
     * @param a
     * @param b
     * @return
     */
    public static int MUti(int a,int b){
        for(int i=0;i<b;i++){
           a= a<<1;
        }
        return a;
    }
    public static void main(String args []){
     System.out.println(MUti(3,3));
    }
}
