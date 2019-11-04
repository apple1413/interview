package com.company.DateStructure;

import javax.xml.soap.Text;

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
            TextNode node3 = new TextNode(3);
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
            ListReverse(node1);
            printNode(node1);
            //findK(node1, 3);
        }
    }

    public static  void ListReverse(TextNode head){

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
        TextNode newNode=head;
        while(curNode!=null){
            TextNode pNext= curNode.next;
            if(pNext==null){
                newNode=curNode;
            }
            curNode.next=preNode;
            preNode=curNode;
            curNode=pNext;
        }
        head=newNode;

    }

    /**
     * 倒数第K个节点
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
