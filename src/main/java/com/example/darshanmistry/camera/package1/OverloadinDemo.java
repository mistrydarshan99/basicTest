package com.example.darshanmistry.camera.package1;

/**
 * Created by darshan.mistry on 10/12/2016.
 */

public class OverloadinDemo {

    public OverloadinDemo() {
        //Method having same name, different param type
    }

    public int method1(String s){
        return 0;
    }

    //this is not valid
   /* public int method1(String s) {
        return 0;
    }*/

    public int method1(int s) {
        return 0;
    }

    public int method1(String s, String s1, int a) {
        return 0;
    }

    public float method1(String s, String s1, float a) {
        return 0;
    }

    int changeDate(float Year){
        return 1;
    }

    float changeDate(int Year){
        return 1;
    }
}
