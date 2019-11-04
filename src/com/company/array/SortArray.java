package com.company.array;

public class SortArray {

    public static int xor_findDup1(int a[]) {
        int n = a.length;
        int i;
        int result = 0;
//		A^A^B
        for (i = 0; i < n; i++) {
            result ^= a[i];
        }
//		1---N-1   A^B
        for (i = 1; i < n; i++) {
            result ^= i;
        }

        return result;
    }
    public static  int xor_findDup2(int[] a) {
        int n = a.length;
        boolean[] flag = new boolean[n];
        int i = 1;
        int result = Integer.MAX_VALUE;
//		初始化
        while (i < n) {
            flag[i] = false;
            i++;
        }//
        for (i = 0; i < n; i++) {
//			a[i]对应flag的索引
            if (flag[a[i]] == false) {
                flag[a[i]] = true;
            } else {
                result = a[i];
                break;
            }
        }//
        return result;

    }
    public static void  main(String[] args){
        int [] a={1,2,1,3,4};

        // selsectSort(a);
        // insertSort(a);
        //dubbleSort(a);
        //  mergeSort(a, 0, a.length - 1);

        System.out.println(    xor_findDup1(a));
//        for (int i=0;i<a.length;i++){
//
//        }

    }
}
