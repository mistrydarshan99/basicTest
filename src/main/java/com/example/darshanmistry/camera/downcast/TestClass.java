package com.example.darshanmistry.camera.downcast;

/**
 * Created by darshan.mistry on 10/14/2016.
 */

public class TestClass {

    public TestClass() {

    }

    private void demo(){

        ParentClass p = new ParentClass();

        ChildClass c = (ChildClass) p;
    }
}
