package com.example.darshanmistry.camera.package1;

/**
 * Created by darshan.mistry on 9/2/2016.
 */

public class ClassA {

    /*Final class cannot be used as baseclass
    * Public can be access every where
    * private can be access within scope
    * default can be access in same package
    * protect canbe access in same package and in subclass of other packages*/

    private int a = 0;
    int b = 1;
    protected  int c = 2;
    public final int as = 0;
    public static int sum;

    public ClassA() {
        sum = 10;
    }

    protected void testA(){
//        as = 0;
    }

    /*Final method cannot be override*/
    public final void demoA() {
    }


}
