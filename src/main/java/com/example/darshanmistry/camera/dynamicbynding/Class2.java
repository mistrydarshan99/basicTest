package com.example.darshanmistry.camera.dynamicbynding;

import android.util.Log;

/**
 * Created by darshan.mistry on 10/13/2016.
 */

public class Class2 extends Class1{

    public Class2() {
    }

    public void doIt(){
        Log.e(Class2.class.getSimpleName(), "----------");
    }

    public void doItClass(){
        Log.e(Class2.class.getSimpleName(), "------Do it class----");
    }
}
