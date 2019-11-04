package com.company.offer;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fun(n));
    }

    public static int fun(int n){
        int sum = 0;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        for(int i=0;i<n;i++){
            sum+=fun(i);
        }
        //sum++;
        return sum;
    }

}
