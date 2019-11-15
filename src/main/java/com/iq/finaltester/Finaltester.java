package com.iq.finaltester;

/**
 * When class final cannot be inherit. Class B cannot extends with A
 * final method cannot be override.
 * Cannot be modifying a final variable
 * Blank final variable. Only can be initialize in side the constructor.
 * Constructor cannot be null. Because constructor never inherit.
 */
final class A{
    public String fName ="Amith";
    final public  String lName ="Samaraweera";
}

/**
 * When class final cannot be inherit. Class B cannot extends with A
 */

/*class B extends A{
}*/

class C {
     final public void run(){
        System.out.println("Run");
    }
}

class D extends C{
    /**
     * final method cannot be override.
     */
    /*@Override
    public void run(){}*/
}

class E{

    /**
     * Blank final variable. Only can be initialize in side the constructor.
     */
    final String category;

    E(){
        category ="Honda";
    }

    void categoryM(){
        //category ="Honda"; -->CT ERROR
    }
}
public class Finaltester {

    public static void main(String[] args) {
        A a = new A();
        a.fName = "Kadawatha D";

        /**
         * Cannot be modifying a final variable
         */
        //a.lName ="Dinamithra";

        System.out.println(a.fName + " " + a.lName);
    }

}
