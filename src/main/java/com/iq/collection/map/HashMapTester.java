package com.iq.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTester {
    /**
     * Allow duplicate values
     * Not allow duplicate key. It's override with new one. Then display last entry.
     * Allow null key and null values
     * Not Synchronized
     * Cannot be talk about order - Check bellow inputs
     *   Integer,String ->  {null=Stack, 1=Iterable, 2=Collection, 3=List, 4=Queue, 5=Set, 6=null}
     *   String,Integer ->  {null=6, Set=1, Collection=2, List=5, Queue=4, Stack=null}
     */

    public static void main(String[] args) {

        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"Iterable");
        hm.put(5,"Set");
        hm.put(2,"Collection");
        hm.put(3,"List");
        hm.put(4,"Queue");
        hm.put(null,"Stack");
        hm.put(6,null);

        Map<String,Integer> hm2 = new HashMap<>();
        hm2.put("Set",1);
        hm2.put("Collection",2);
        hm2.put("List",5);
        hm2.put("Queue",4);
        hm2.put("Stack",null);
        hm2.put(null,6);

        System.out.println(hm2);
    }
}
