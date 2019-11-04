package com.company.DateStructure;

import javax.xml.soap.Text;

class TextNode {
    int data;
    TextNode next;
}

public class Sou {


    public static void main(String[] args) {
        {
            TextNode node1 = new TextNode();

            TextNode node2 = new TextNode();
            TextNode node3 = new TextNode();
            TextNode node4 = new TextNode();
            node1.data = 2;
            node2.data = 4;
            node3.data = 5;
            node4.data = 3;
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
           // printNode(node1);
            ReSort(node1);
           printNode(node1);
        }
    }

        /**
         * 链表重新排序
         *
         * @param head
         */
        public static void ReSort (TextNode head){
            int temp=0;
            TextNode nextNode = null;
            TextNode curNode = head;
            while (curNode.next != null) {
                nextNode = curNode.next;
                while (nextNode!= null) {
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
        public static void printNode (TextNode node){
            while (node!= null) {
                System.out.println(node.data);
                node = node.next;
            }
        }
    }
