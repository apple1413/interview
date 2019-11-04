package com.company.weiyunsuan;

import java.lang.reflect.Array;

public class Dynamic {

    public static int coinChange(int [] A,int M){
        int [] f=new int[M+1];
        int n=A.length;

        f[0]=0;

        int i,j;
        for( i=1;i<=M;++i){
            f[i]=Integer.MAX_VALUE;
            f[i]=-1;
            for(j=0;j<n;++j){
                if(i>A[j]&&f[i-A[j]]!=Integer.MAX_VALUE){
                    f[i]=Math.min(f[i-A[j]]+1,f[i]);
                }
            }

        }
        if(f[M]==Integer.MAX_VALUE){
            f[M]=-1;
        }
        return f[M];
    }

    public static void  main(String args [] ){

        int [] array={2,5,7};



      System.out.println(   coinChange(array,27));
    }

}
