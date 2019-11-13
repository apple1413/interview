package com.company.DateStructure;

import javax.xml.soap.Text;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;

class TextNode {
    public TextNode(int data) {
        this.data = data;
    }

    int data;
    TextNode next;
}

public class Sou {
    public static final String path = "E:/input.txt";
    public String name = null;

    public void readFile() {
        File file = new File(path);
        BufferedReader reader = null;
        HashMap<String, Double> map = new HashMap<String, Double>();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempStr = null;
            while ((tempStr = reader.readLine()) != null) {
                String[] str = tempStr.split(" ");
                name = str[0];
                double temp = 1;
                if (map.containsKey(str[1])) {
                    temp = (Double) map.get(str[1]);
                    map.put(str[1], ++temp);
                } else {
                    map.put(str[1], temp);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //算概率
        double SumShang = 0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            double avg = entry.getValue() / map.size();
            map.put(entry.getKey(), avg);
            // log((double)N)/log((double)2)
            SumShang += -avg * log2(avg);
        }
        System.out.println(name + "下wifimac熵值 :" + SumShang);

    }

    public double log2(double N) {
        return Math.log(N) / Math.log(2);//Math.log的底为e
    }

    public static void main(String[] args) {
        {

           /* ArrayList<Integer> list1 = new ArrayList<Integer>(10);
            list1.add(1);
            list1.add(2);
            ArrayList<Integer> list2 = new ArrayList<Integer>(list1);
            TextNode node1 = new TextNode(2);
            TextNode node2 = new TextNode(3);
            TextNode node3 = new TextNode(4);
            TextNode node4 = new TextNode(5);
            TextNode node5 = new TextNode(5);
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            // printNode(node1);
            //  ReSort(node1);

            //  deleteDupl(node1);
            //  printNode(node1);
            //   ListReverse(node1);
            // printNode(node1);
            //findK(node1, 3);
            // System.out.println(findMidNode(node1).data);

            pushStack(4);
            pushStack(3);
            pushStack(2);
            pushStack(1);
            // int a=5>>1;

            //  System.out.println(    Integer.toBinaryString(a));
         *//*   System.out.println(popStack());
            System.out.println(popStack());
            System.out.println(popStack());
            System.out.println(popStack());
            int a[]={1,3,2,5,2};
            SelectSor(a);*//*
            int a[] = {4, 5, 6, 1, 4, 7, 4, 5, 3, 6};
            //findMaxChildArray(a);
            //QuickSort(a, 0, a.length - 1);
            //  System.out.println(findK(a, 0, a.length - 1, 3));
            System.out.println(findTwoDistance(a, 4, 6));*/
            int[] a = {1, 2, 3, 0, 5};

            String s1 = "aaabbcc";
            String s2 = "aa abbc cc";
            compare(s1, s2);
            System.out.println(caclNumberString(s2));
        }
    }

    /**
     * 判断字符串中有多少个单词
     * @param str
     * @return
     */
    public static  int  caclNumberString(String str){
        int word=1;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                word=1;
            }else if(word==1){
                count++;
                word=0;
            }
        }
          return  count;

    }

    /**
     * 删除字符串中重复的字符
     * @param str
     * @return
     */
    public static String removeDuplicate(String str) {

        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = '\0';
                }
            }
        }
        int l = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != '\0') {
                a[l++] = a[i];
            }
        }
        return new String(a, 0, l);

    }

    /**
     * 判断两个字符串是否由相同的字符组成
     *
     * @param s1
     * @param s2
     */
    public static void compare(String s1, String s2) {
        byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();
        Arrays.sort(b1);
        Arrays.sort(b2);
        s1 = new String(b1);
        s2 = new String(b2);
        if (s1.equals(s2)) {
            System.out.println("equal");
        } else {
            System.out.println("false");

        }


    }

    /**
     * 判断一个数组中的数值是否连续相邻
     */
    public static Boolean judageArray(int a[]) {
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

            }
            if (min > a[i])
                min = a[i];
        }

        return max - min <= 5 ? true : false;
    }

    /**
     * 排序好的数组中 获取绝对值最小的数
     *
     * @param a
     * @return
     */
    public static int findAbsoluteMin(int[] a) {
        int mid = 0;
        int i = 0, j = a.length;
        if (a[0] > 0) {
            return a[0];
        } else if (a[a.length - 1] < 0) {
            return a[a.length - 1];
        } else {
            while (i <= j) {
                mid = (j + i) / 2;
                if (a[mid] > 0 && a[mid - 1] < 0) {
                    return a[mid] > -a[mid - 1] ? a[mid - 1] : a[mid];
                } else if (a[mid] < 0) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }

            }

        }
        return 0;

    }

    /**
     * 求数组中两个元素的最小距离
     *
     * @param a
     * @param i
     * @param j
     * @return
     */
    public static int findTwoDistance(int[] a, int i, int j) {
        int k = 0;
        int A = -1;
        int B = -1;
        int distance = Integer.MAX_VALUE;
        for (; k < a.length; k++) {
            if (a[k] == i) {
                A = k;
                if (B >= 0 && Math.abs(A - B) < distance) {
                    distance = Math.abs(A - B);
                }
            }
            // distance= A-B;

            if (a[k] == j) {
                B = k;
                //distance=B-A;
                if (A >= 0 && Math.abs(A - B) < distance) {
                    distance = Math.abs(A - B);
                }
            }

        }
        return distance;
    }


    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * 递归求解数组的最大值
     *
     * @param a
     * @param begin
     * @return
     */
    public static int maxnum(int a[], int begin) {
        int length = a.length - begin;
        if (length == 1) {
            return a[begin];
        } else {
            return max(a[begin], maxnum(a, begin + 1));
        }
    }

    /**
     * 找出1-n唯一重复的元素
     *
     * @param a
     * @return
     */
    public static int findOnlyKey(int a[]) {
        int i = 0;
        int tem1 = 0, tem2 = 0;
        for (; i < a.length; i++) {
            tem1 += a[i];
            tem2 += i;
        }
        return tem1 - tem2;


    }

    /**
     * 找出倒数第k个小的数
     *
     * @param R
     * @param l
     * @param r
     * @param k
     * @return
     */
    public static int findK(int R[], int l, int r, int k) {
        int i = l;
        int j = r;
        int temp = 0;

        temp = R[l];
        while (i < j) {

            while (i < j && R[j] > temp) --j;
            if (i < j) {
                R[i] = R[j];
                ++i;
            }
            while (i < j && R[i] < temp) ++i;
            if (i < j) {
                R[j] = R[i];
                --j;
            }
        }
        R[i] = temp;
        if (k == i + 1) {
            return R[i];
        } else if (i + 1 > k) {
            return findK(R, l, i - 1, k);
        } else {
            return findK(R, i + 1, r, k);
        }

        //    QuickSort(R, i + 1, r);


    }


    /**
     * 查找子数组最大
     *
     * @param a
     * @return
     */
    public static int findMaxChildArray(int a[]) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (temp > max) {
                    max = temp;
                }
                temp += a[j];
            }
        }

        return max;
    }

    public static void findKIndex(int a[]) {
        int start = 0;
        int end = a.length;
        int temp = a[start];
        while (start < end) {
            int mid = (end - start) / 2;

            while (start < end && temp > a[end]) --end;

            a[start] = temp;

            while (start < end && temp < a[end]) ++start;

            a[end] = temp;


            if (start < end) {

            }

        }

    }


    /**
     * 快速排序
     *
     * @param R
     * @param l
     * @param r
     */
    public static void QuickSort(int R[], int l, int r) {
        int i = l;
        int j = r;
        int temp = 0;
        // if (l < r) {
        temp = R[l];
        while (i != j) {

            while (i < j && R[j] > temp) --j;
            if (i < j) {
                R[i] = R[j];
                ++i;
            }
            while (i < j && R[i] < temp) ++i;
            if (i < j) {
                R[j] = R[i];
                --j;
            }
        }
        R[i] = temp;

        QuickSort(R, l, i - 1);
        QuickSort(R, i + 1, r);
        //  }

    }

    /**
     * 获取数组第二大的
     *
     * @param a
     * @return
     */
    public static int findSendMax(int a[]) {
        int max = a[0];
        int sec = a[0];
        for (int j = 0; j < a.length; j++) {
            if (a[j] > max) {
                sec = max;
                max = a[j];
            } else if (a[j] > sec) {
                sec = a[j];
            }
        }
        return sec;
    }


    /**
     * 找出数组最大最小值
     *
     * @param a
     */
    public static void findMaxandMin(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int j = 1; j < a.length; j++) {
            if (a[j] > min) {
                int temp = a[j];
                a[j] = min;
                min = temp;

            } else if (a[j] < max) {
                int temp = a[j];
                a[j] = max;
                max = temp;

            }
        }


    }

    /**
     * 判断数字有多少个1
     *
     * @param n
     */
    public static int howCountOne(int n) {

        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    /**
     * 选择排序
     *
     * @param array
     */
    public static void SelectSor(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            k = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[k] > array[j]) {
                    swap(array, k, j);
                }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }


    /**
     * 两个栈模拟队列
     */
    class Queue {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void pushQuque(int a) {
            stack1.push(a);
        }

        public int pop() {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

    }


    static LinkedList<Integer> list1 = new LinkedList<>();
    static LinkedList<Integer> list2 = new LinkedList<>();

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void pushStack(int a) {
        list1.addLast(a);
    }

    public static int popStack() {
        if (list2.size() == 0) {
            while (list1.size() > 1) {
                list2.addLast(list1.pop());
            }
            return list1.pop();
        } else {
            while (list2.size() > 1) {
                list1.addLast(list2.pop());
            }
            return list2.pop();

        }

    }


    /**
     * 找到链表的中间节点
     *
     * @param head
     * @return
     */
    public static TextNode findMidNode(TextNode head) {

        TextNode preNode = head;
        TextNode behNode = head;

        while (behNode != null && behNode.next != null && behNode.next.next != null) {
            preNode = preNode.next;
            behNode = behNode.next.next;

        }

        return preNode;

    }


    /**
     * 翻转单链表
     *
     * @param head
     */
    public static void ListReverse(TextNode head) {

     /*   TextNode curNode = head;
        head.next=null;
        TextNode newHead = null;
        TextNode p=null;
        int num = 0;
        while (curNode != null) {
          p=  curNode.next;
            curNode.next=newHead.next;
            newHead.next=curNode;
            curNode=p;
        }*/
        TextNode curNode = head;
        TextNode preNode = null;
        TextNode newNode = head;
        while (curNode != null) {
            TextNode pNext = curNode.next;
            if (pNext == null) {
                newNode = curNode;
            }
            curNode.next = preNode;
            preNode = curNode;
            curNode = pNext;
        }
        head = newNode;

    }

    /**
     * 倒数第K个节点
     *
     * @param head
     * @param k
     * @return
     */
    public static TextNode findK(TextNode head, int k) {
        TextNode newNode = head;
        TextNode curNode = head;
        int num = 0;
        while (curNode != null) {
            num++;
            if (num == k) {
                newNode = newNode.next;

            }
            curNode = curNode.next;
        }
        return newNode;
    }


    /**
     * 链表重新排序
     *
     * @param head
     */
    public static void ReSort(TextNode head) {
        int temp = 0;
        TextNode nextNode = null;
        TextNode curNode = head;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (nextNode.data < curNode.data) {
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
    }

    /**
     * 删除链表重复的元素
     *
     * @param head
     */
    public static void deleteDupl(TextNode head) {
        TextNode nextNode = null;
        TextNode curNode = head;
        while (curNode != null) {
            TextNode preNextNode = curNode;
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data == nextNode.data) {
                    if (nextNode != null) {
                        preNextNode.next = nextNode.next;
                    }

                }
                preNextNode = preNextNode.next;
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        System.out.println("1");

    }

    public static void printNode(TextNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
