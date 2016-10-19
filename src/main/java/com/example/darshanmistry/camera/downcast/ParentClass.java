package com.example.darshanmistry.camera.downcast;

import android.util.Log;

/**
 * Created by darshan.mistry on 10/14/2016.
 */

public class ParentClass {

    public void testMehotd() {
        Log.e(ParentClass.class.getSimpleName(), "Parent class method");
    }

    private String name;
    private int age;

    public boolean equals(Object anObject) {
        if (anObject == null)
            return false;

     /* The object being passed in is checked
         to see it's class type which is then compared
         to the class type of the current class.  If they
         are not equal then it returns false
     */

        else if (getClass() != anObject.getClass())
            return false;

        else {
        /*
         this is a downcast since the Object class
         is always at the very top of the inheritance tree
         and all classes derive either directly or indirectly
         from Object:
        */
            ParentClass aPerson = (ParentClass) anObject;
            return (name.equals(aPerson.name)
                    && (age == aPerson.age));
        }
    }
}
