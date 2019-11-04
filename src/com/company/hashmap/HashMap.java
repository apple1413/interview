package com.company.hashmap;

import java.util.ArrayList;
import java.util.List;

public class HashMap <K,V> implements BseMap<K,V>{

    private int defaultLength=16;//默认长度
    private  double defaultAddFactor=0.75;//默认加载因子
    private double useSize;//使用数组位置的数量
    private Entry<K,V>[] table;

    public HashMap(int defaultLength, double defaultAddFactor ) {
        this.defaultLength = defaultLength;
        this.defaultAddFactor = defaultAddFactor;
        table=new Entry[10];
    }
    public HashMap() {
      this(16,0.75);
    }

    /**
     * 计算hashcode
     */
    private int hash(int  hashCode){
        hashCode = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        return hashCode ^ ((hashCode >>> 7) ^ hashCode >>> 4);
    }
    /**
     * 获取保存位置的数组下标
     *
     * @param k
     * @param length
     * @return
     */
    private int getIndex(K k, int length) {
        int m = length - 1;
        int index = hash(k.hashCode()) & m;//取模
        return index >= 0 ? index : -index;
    }

    @Override
    public V put(K k, V v) {
        if(useSize>defaultAddFactor*defaultLength){
            //扩容
            reSize();
        }
        //计算出下标
        int index=getIndex(k,table.length);
        Entry<K,V> entry=table[index];
        Entry<K,V> newEntry= new Entry<K,V>(k,v,null);
        if(entry==null){
            table[index]= newEntry;
            useSize++;
        }else{

            if(entry.getKey()==k||(entry.getKey().equals(k))){
                entry.v=v;
            }else{
                while(entry.next!=null){
                    if(entry.next.getKey()==k||(entry.next.getKey().equals(k))){
                        entry.next.v=v;
                        break;
                    }
                    entry=entry.next;
                }
                if(entry.next==null){
                    entry.next=newEntry;
                }
            }
        }
        return newEntry.getValue();
    }

    @Override
    public V get(K k) {
        int index=getIndex(k,table.length);
        Entry entry=table[index];
        while(entry!=null){
            if(k == entry.getKey() || k.equals(entry.getKey())){
                return (V) entry.v;
            }else{
                entry=entry.next;
            }
        }
        return null;
    }

    /**
     * 扩容Entry
     */
   private void  reSize(){
       Entry<K, V>[] newTable = new Entry[defaultLength * 2];
       List<Entry<K, V>> list = new ArrayList<>();
       for (int i = 0; i < table.length; i++) {
           if (table[i] == null)
               continue;
           //遍历链表 添加到list
           Entry<K, V> entry = table[i];
           while (entry != null) {
               list.add(entry);
               entry = entry.next;
           }
       }
       if (list.size() > 0) {
           useSize = 0;
           defaultLength = defaultLength * 2;
           table = newTable;
           for (Entry<K, V> entry : list) {
               //分离所有的entry
               if (entry.next != null) {
                   entry.next = null;
               }
               put(entry.getKey(), entry.getValue());
           }
       }
   }
}
