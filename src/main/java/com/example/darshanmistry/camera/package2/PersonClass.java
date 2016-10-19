package com.example.darshanmistry.camera.package2;

import com.example.darshanmistry.camera.package1.ClassA;

/**
 * Created by darshan.mistry on 9/2/2016.
 */

public class PersonClass extends ClassA{

   private String name, age;

    public PersonClass(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
