package com.iq.coding;

public class ArrayMinValue {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,6,7,11,0};

        int minVal = arr[0];

        for(int x : arr){
            if(x<minVal){
                minVal = x;
            }
        }
        System.out.println(minVal);
    }
}
