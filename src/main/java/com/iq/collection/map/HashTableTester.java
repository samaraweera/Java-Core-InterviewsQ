package com.iq.collection.map;

import java.util.Hashtable;

public class HashTableTester {
    /**
     * Not allow null key or value. It occurs at run time.
     * Cannot be duplicates keys. It's override with new one. Then display last entry.
     * Can be duplicates values
     *  TODO -> Hashtable class is Synchronized.
     * Cannot be talk about the order - Check bellow inputs
     *      Integer,String ->{5=Set, 4=Queue, 3=List, 2=Collection, 1=Iterable}
     *      String,Integer ->{List=5, Collection=2, Queue=4, Set=1}
     */
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable();
        ht.put(1,"Iterable");
        ht.put(5,"Set");
        ht.put(2,"Collection");
        ht.put(3,"List");
        ht.put(4,"Queue");

        Hashtable<String, Integer> ht2 = new Hashtable();
        ht2.put("Set",1);
        ht2.put("Collection",2);
        ht2.put("List",5);
        ht2.put("Queue",4);

        /*ht.put(null,"LinkedList");
        ht.put(6,null);*/

        System.out.println(ht2);

    }
}
