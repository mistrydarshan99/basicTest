package com.example.darshanmistry.camera.innerClass;

import android.util.Log;

/**
 * Created by darshan.mistry on 10/18/2016.
 */

public class NestedClassVsInnerClass {

    private int sum = 99;
    private static int minus = 20;
    private static final String TAG = NestedClassVsInnerClass.class.getSimpleName();
    /*Nested classes can be further classified into two different types of classes:
    non-static nested classes and static nested classes.
    Non-static nested classes are more formally known as inner classes. */

    /*Remember that an inner class is a specific type of nested class that occurs when a nested class is non-static.
     And that is the “difference” between an inner class and a nested class – in other words,
     inner classes are subsets of nested classes.
     So, be careful, because the terms “inner class” and “nested class” are NOT interchangeable.
     You can say that an inner class is also a nested class,
     but you can NOT say that a nested class is also an inner class.
     This is because nested classes are part of the larger set that includes both inner classes and static nested classes.*/

    /*what exactly is special about inner classes?
     Well, the main thing that you must remember about inner classes is that an
     instance of an inner class has access to all of the members of the outer class,
     even those that are marked “private”. So, when an instance of the inner class is created,
     there are no issues with having the inner class access the instance variables of the outer class.*/

    private void outerMethod() {

    }

    private static void outerMethod1() {

    }

    class InnerClass {
        /*  some code here...*/

        private void demo() {
            /*Here all variable access*/
            Log.e(TAG, "variable value is ---->" + sum);
            Log.e(TAG, "variable value is ---->" + minus);
            outerMethod();
        }
    }

    public static class NestesClass {

        private void demo() {
            /*Here only static variable and method access*/
            Log.e(TAG, "variable value is ---->" + minus);
            outerMethod1();
        }

        public void demo1(){
            Log.e(TAG, "variable value is ---->" + minus);
            outerMethod1();
        }
    }

}
