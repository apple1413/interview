package com.company.offer;

public class CommonStr {


    public static void  main(String [] args){
       System.out.println(commonNum("abcd","ebcdf"));
    }
    public static int commonNum(String str1,String str2){
        int p=0,q=0;
        int maxNum=0;
        int subNum=0;
        char[]  str1CharArray=str1.toCharArray();
        char[]  str2CharArray=str2.toCharArray();
        for(int i=0;i<str1CharArray.length;i++){
            for(int j=0;j<str2CharArray.length;j++){
                p=i;
                q=j;
                subNum=0;
                while(str2CharArray[q]==str1CharArray[p]){
                    p++;
                    q++;
                    subNum++;
                    if(subNum>maxNum){
                        maxNum=subNum;
                    }
                    if(p==str1CharArray.length||q==str2CharArray.length){
                       break;
                    }
                }
            }
        }
        return maxNum;
    }
}
