package com.example.darshanmistry.camera.innerClass;

/**
 * Created by darshan.mistry on 10/18/2016.
 */

public class ArgsAnnomyasInnerClass {

    /*class with no name (which is why it is called ANONYMOUS)*/
  public interface ExampleInterface {
        void interfaceMethod();
    }

    public void exampleMethod(ExampleInterface e) {
        e.interfaceMethod();
    }


}
