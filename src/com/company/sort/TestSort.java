/*
package com.company.sort;

import java.lang.ref.SoftReference;

public class TestSort {
    */
/**
     *插入排序
     *//*

    public static void insertSort(int [] a){
        if(a!=null){
            for(int i=1;i<a.length;i++){
                int temp=a[i],j=i;
                //if(a[j-1]>temp) {
                    while (j >= 1&&a[j - 1] > temp  ) {
                        a[j] = a[j - 1];
                        j--;
                    }
               // }
                a[j]=temp;
            }
        }
    }

    */
/**
     * 选择排序
     * @param a
     *//*

    public static void selsectSort(int [] a){
        int temp;

        for(int i=0;i<a.length;i++){
            temp=a[i];
            for(int j=i+1;j<a.length;j++){
                if(a[j]<temp){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    }

    */
/**
     * 冒泡排序
     *//*

    public static void dubbleSort(int [] a){
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>i;j--){
                int temp;
                if(a[j-1]>a[j]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }

    }

    */
/**
     * 归并排序
     *
     * @param arrays
     * @param L      指向数组第一个元素
     * @param R      指向数组最后一个元素
     *//*

    public static void mergeSort(int[] arrays, int L, int R) {

        //如果只有一个元素，那就不用排序了
        if (L == R) {
            return;
        } else {

            //取中间的数，进行拆分
            int M = (L + R) / 2;

            //左边的数不断进行拆分
            mergeSort(arrays, L, M);

            //右边的数不断进行拆分
            mergeSort(arrays, M + 1, R);

            //合并
            merge(arrays, L, M + 1, R);

        }
    }


    */
/**
     * 合并数组
     *
     * @param arrays
     * @param L      指向数组第一个元素
     * @param M      指向数组分隔的元素
     * @param R      指向数组最后的元素
     *//*

    public static void merge(int[] arrays, int L, int M, int R) {

        //左边的数组的大小
        int[] leftArray = new int[M - L];

        //右边的数组大小
        int[] rightArray = new int[R - M + 1];

        //往这两个数组填充数据
        for (int i = L; i < M; i++) {
            leftArray[i - L] = arrays[i];
        }
        for (int i = M; i <= R; i++) {
            rightArray[i - M] = arrays[i];
        }


        int i = 0, j = 0;
        // arrays数组的第一个元素
        int  k = L;


        //比较这两个数组的值，哪个小，就往数组上放
        while (i < leftArray.length && j < rightArray.length) {

            //谁比较小，谁将元素放入大数组中,移动指针，继续比较下一个
            if (leftArray[i] < rightArray[j]) {
                arrays[k] = leftArray[i];

                i++;
                k++;
            } else {
                arrays[k] = rightArray[j];
                j++;
                k++;
            }
        }

        //如果左边的数组还没比较完，右边的数都已经完了，那么将左边的数抄到大数组中(剩下的都是大数字)
        while (i < leftArray.length) {
            arrays[k] = leftArray[i];

            i++;
            k++;
        }
        //如果右边的数组还没比较完，左边的数都已经完了，那么将右边的数抄到大数组中(剩下的都是大数字)
        while (j < rightArray.length) {
            arrays[k] = rightArray[j];

            k++;
            j++;
        }
    }
    public static void shellSort(int array[]){
        int length=array.length;
        int i,j;
        System.out.println(Integer.MIN_VALUE);
        int h;
        int temp;
        for(h=length/2;h>0;h=h/2){
            for(i=h;i<length;i++){
                temp=array[i];
                for(j=i-h;j>=0;j-=h){
                    if(temp<array[j]){
                        array[j+h]=array[j];
                    }else{
                        break;
                    }
                    array[j+h]=temp;
                }
            }
        }
    }
    public static void  main(String[] args){
        new SoftReference<new ()>();
        int [] a={43,8,1,3,5,2,4,7,66};

       // selsectSort(a);
       // insertSort(a);
        //dubbleSort(a);
      //  mergeSort(a, 0, a.length - 1);
        shellSort(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
*/
