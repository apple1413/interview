package com.company.DateStructure;

import javax.xml.soap.Text;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Stack;

class TextNode {
    public TextNode(int data) {
        this.data = data;
    }

    int data;
    TextNode next;
}

public class Sou {


    public static void main(String[] args) {
        {

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
         /*   System.out.println(popStack());
            System.out.println(popStack());
            System.out.println(popStack());
            System.out.println(popStack());
            int a[]={1,3,2,5,2};
            SelectSor(a);*/
            int a[] = {-1, -3, 4, 9, -4, -7, -1, -5};
            //findMaxChildArray(a);
            //QuickSort(a, 0, a.length - 1);
            System.out.println(findK(a,0, a.length - 1,3));
        }
    }

    /**
     * 找出倒数第k个小的数
     * @param R
     * @param l
     * @param r
     * @param k
     * @return
     */
    public static int findK(int R[], int l, int r,int k){
        int i = l;
        int j = r;
        int temp=0;

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
            R[i] =temp;
            if(k==i+1){
                return R[i];
            }else if(i+1>k){
               return findK(R, l, i-1,k);
            }else{
               return findK(R, i+1, r,k);
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
     * @param R
     * @param l
     * @param r
     */
    public static void QuickSort(int R[], int l, int r) {
        int i = l;
        int j = r;
        int temp=0;
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
            R[i] =temp;

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
