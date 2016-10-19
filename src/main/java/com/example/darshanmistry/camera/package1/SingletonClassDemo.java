package com.example.darshanmistry.camera.package1;

/**
 * Created by darshan.mistry on 10/12/2016.
 */
public class SingletonClassDemo {

    private static SingletonClassDemo ourInstance = new SingletonClassDemo();

    public static SingletonClassDemo getInstance() {
        return ourInstance;
    }

    private SingletonClassDemo() {
    }
}
