package com.iq.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTester {

    /**
     * Key cannot be null
     * Not allow duplicates keys, Override with new one.
     * Can be duplicate values
     * Maintains Ascending order(Because ehy key cannot be null)- Check bellow inputs
     *      Integer,String ->{1=Iterable, 2=Collection, 3=List, 4=null, 5=Set, 6=null}
     *      String,Integer ->{1=Iterable, 5=Set, 2=Collection, 3=List, 4=Queue, null=Stack, 6=null}
     * TODO -> Where do u use this.
     */
    public static void main(String[] args) {
        Map<Integer,String> tm = new TreeMap<>();
        tm.put(1,"Iterable");
        tm.put(5,"Set");
        tm.put(2,"Collection");
        tm.put(3,"List");
        tm.put(4,"Queue");
        tm.put(6,null);
        tm.put(4,null);


        Map<String,Integer> hm2 = new TreeMap<>();
        hm2.put("Set",1);
        hm2.put("Collection",2);
        hm2.put("List",5);
        hm2.put("Queue",4);
        hm2.put("Stack",null);

        System.out.println(hm2);
    }
}
