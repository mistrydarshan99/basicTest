package com.example.darshanmistry.camera.innerClass;

import android.util.Log;

import com.example.darshanmistry.camera.package1.ClassA;
import com.example.darshanmistry.camera.package1.ClassB;


/**
 * Created by darshan.mistry on 10/17/2016.
 */

public class OuterClass extends ClassA {

    private static String test = "";
    private int abc = 50;
    private static final String TAG = OuterClass.class.getSimpleName();

    public class InnerClass extends ClassB {
        /*Inner class cannot contain static variable,
        * Cannot contain static method*/
//        private static String demo = "";

//        public static void method(){}

        public void method2() {
            Log.e(TAG, "variable value is ---->" + abc);
        }

        private void methodPrivate(){
            Log.e(TAG, "variable value is ---->" + abc);
        }
    }
}
