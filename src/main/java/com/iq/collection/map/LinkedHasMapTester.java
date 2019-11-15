package com.iq.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapTester {

    /**
     * Can be null key or values
     * Can be duplicates values
     * Cannot be duplicates keys
     * Maintain Insertion order - Check bellow inputs
     *      Integer,String ->{1=Iterable, 5=Set, 2=Collection, 3=List, 4=Queue, null=Stack, 6=null}
     *      String,Integer ->{Set=1, Collection=2, List=5, Queue=4, Stack=null, null=6}
     */

    public static void main(String[] args) {
        Map<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(1,"Iterable");
        lhm.put(5,"Set");
        lhm.put(2,"Collection");
        lhm.put(3,"List");
        lhm.put(4,"Queue");
        lhm.put(null,"Stack");
        lhm.put(6,null);

        Map<String,Integer> hm2 = new LinkedHashMap<>();
        hm2.put("Set",1);
        hm2.put("Collection",2);
        hm2.put("List",5);
        hm2.put("Queue",4);
        hm2.put("Stack",null);
        hm2.put(null,6);

        System.out.println(hm2);

    }
}
