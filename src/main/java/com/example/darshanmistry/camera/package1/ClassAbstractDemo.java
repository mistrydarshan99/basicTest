package com.example.darshanmistry.camera.package1;


import android.util.Log;

import com.example.darshanmistry.camera.package1.interfaces.intergaceDemo;

/**
 * Created by darshan.mistry on 9/13/2016.
 */

public abstract class ClassAbstractDemo implements intergaceDemo {

    /*Point to be remember*/
    /*Class can be declare abstract without having any abstract method,
    * All abstract method must be implement in sub class,
    * method without abstract keyword is not necessary implement to sub class
    * if user wish than he can implement those methods*/

    @Override
    public void A() {
        Log.e("ClassAbstractDemo", "-----------calling interface method A--------->");
    }

    public abstract void draw();

    public abstract void draw1();

    void test() {
    }
}
