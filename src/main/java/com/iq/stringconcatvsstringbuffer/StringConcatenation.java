package com.iq.stringconcatvsstringbuffer;

import jdk.nashorn.internal.ir.CallNode;

public class StringConcatenation {

    String arr[] = {"private","default","protected","public"};

    /**
     * This is the normal way to concatenate string. When we create final object there is created fore object.Like,
     *  private
     *  private default
     *  private default protected
     *  private default protected publish
     * This is ok for the minimal concatenation. Think about thousand of words concatenation.
     * It's memory wast.
     */
    public void stringConcatenation(){
        String total = "";

        for(String val : arr){
            total += val+" ";
        }
        System.out.println(total);
    }

    /**
     * Solution for the above problem is StringBuilder. StringBuilder is mutable. Then create only one object and modifying it.
     * Then no need more memory
     */

    public void stringConcatenationWithSpringBuilder(){
        StringBuilder sb = new StringBuilder();
        for (String val:arr
             ) {
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringConcatenation obj = new StringConcatenation();
        obj.stringConcatenationWithSpringBuilder();
    }
}
