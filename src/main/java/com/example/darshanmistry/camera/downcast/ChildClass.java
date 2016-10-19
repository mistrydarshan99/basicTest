package com.example.darshanmistry.camera.downcast;

import android.util.Log;

/**
 * Created by darshan.mistry on 10/14/2016.
 */

public class ChildClass extends ParentClass {

    public void testMehotd() {
        Log.e(ChildClass.class.getSimpleName(), "ChildClass class method");
    }
}
