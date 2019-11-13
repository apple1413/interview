package com.company;

/**
 * as-if-serial语义分析
 */
public class RecordExample1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        try {
            a = 3;           //A
            b = 1 / 0;       //B
        } catch (Exception e) {

        } finally {
            System.out.println("a = " + a);
        }
    }

    private static RecordExample1 recordExample1;

    //线程不安全的单例模式
    public static RecordExample1 getInstance() {
        if (recordExample1 == null) {
            recordExample1 = new RecordExample1();
        }
        return recordExample1;
    }
}