package com.example.darshanmistry.camera.package1;

import android.util.Log;

/**
 * Created by darshan.mistry on 9/2/2016.
 */

public class ClassB {

    public ClassB() {
    }

    public void method1() {
        ClassA classA = new ClassA();
        classA.b = 10;
        classA.c = 20;
        Log.e("ClassB", "ClassB method1 callled");
    }

    private void method2() {
        Log.e("ClassB", "ClassB method2 callled");
    }

    protected void method3() {
        Log.e("ClassB", "ClassB method3 callled");
    }
}
