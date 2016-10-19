package com.example.darshanmistry.camera.innerClass;

import android.util.Log;

/**
 * Created by darshan.mistry on 10/18/2016.
 */

public class AnnonymasInnerClass {

    private static final String TAG = AnnonymasInnerClass.class.getSimpleName();

    public void test(){
        ProgrammerInterview programmerInterview = new ProgrammerInterview() {
            @Override
            public void read() {
                super.read();
                System.out.println("anonymous ProgrammerInterview");
            }

            public void test(){
                System.out.println("anonymous ProgrammerInterview");
            }
        };
        programmerInterview.read();
    }

    public void annonaymasInterface(){
        Testing testing = new Testing() {
            @Override
            public void interfaceTest() {
                Log.e(TAG, "interfaceTest: -------------->");
            }
        };
        testing.interfaceTest();


    }
}
