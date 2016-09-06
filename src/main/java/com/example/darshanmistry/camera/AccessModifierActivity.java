package com.example.darshanmistry.camera;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.darshanmistry.camera.package1.ClassB;

/**
 * Created by darshan.mistry on 9/2/2016.
 */

public class AccessModifierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access);

        ClassB classB = new ClassB();
        classB.method1();
    }
}
