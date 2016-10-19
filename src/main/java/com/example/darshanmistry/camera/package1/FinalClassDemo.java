package com.example.darshanmistry.camera.package1;

/**
 * Created by darshan.mistry on 10/12/2016.
 */

public class FinalClassDemo {
    /*-------Point to be rember----------
    * Final class cannot be extended
    * Final method cannot be override
    * Final variable cannot be changed
    * Finally block always execute
    * When System.exit() or JVM crash then finally is not called*/

    public final String demo = "test";

    public FinalClassDemo() {
    }

    public final void demo() {
    }
}
