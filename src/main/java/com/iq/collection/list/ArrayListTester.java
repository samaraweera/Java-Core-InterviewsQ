package com.iq.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTester {
    /**
     * Searching purpose ArrayList is best
     * Cannot be say about order . But seems Insertion order
     * Normally add to the last element. But we can specify location when adding it.
     */
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>(10);

        lst.add(2);
        lst.add(1,1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        //lst.add(6,5);

        /*List<String> sLst = new ArrayList<>();
        sLst.add("ArList");
        sLst.add("LkList");
        sLst.add("Stack");
        sLst.add("Vectors");*/

        System.out.println(lst);
    }
}
