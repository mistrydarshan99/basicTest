package com.example.darshanmistry.camera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.darshanmistry.camera.downcast.ParentClass;
import com.example.darshanmistry.camera.dynamicbynding.Class1;
import com.example.darshanmistry.camera.dynamicbynding.Class2;
import com.example.darshanmistry.camera.innerClass.AnnonymasInnerClass;
import com.example.darshanmistry.camera.innerClass.ArgsAnnomyasInnerClass;
import com.example.darshanmistry.camera.innerClass.NestedClassVsInnerClass;
import com.example.darshanmistry.camera.innerClass.OuterClass;
import com.example.darshanmistry.camera.launchmode.Activity_launch_standard;
import com.example.darshanmistry.camera.package2.PersonClass;

public class ContentActivity extends AppCompatActivity {

    private Button btnLifeCycle, btnFragmentLifeCycle, btnAccess, btnLaunchMode;
    private static final String TAG = ContentActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        someTrickyInterviewQue();

        btnLifeCycle = (Button) findViewById(R.id.btnLifeCycle);
        btnLifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContentActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnFragmentLifeCycle = (Button) findViewById(R.id.btnFragmentLifeCycle);
        btnFragmentLifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContentActivity.this, FragmentActivity.class);
                startActivity(intent);
            }
        });

        btnAccess = (Button) findViewById(R.id.btnAccess);
        btnAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContentActivity.this, FragmentActivity.class);
                startActivity(intent);
            }
        });

        btnLaunchMode = (Button) findViewById(R.id.btnLaunchMode);
        btnLaunchMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContentActivity.this, Activity_launch_standard.class);
                startActivity(intent);
            }
        });
    }

    private void someTrickyInterviewQue() {

        /*Dynamic binding*/
        Class1 class1 = new Class2();
        class1.doIt();

        Class2 class2 = new Class2();
        class2.doIt();
        class2.doItClass();
        /*Dynamic binding end*/

        int i = 0;
        Log.e(TAG, "Now value is --->" + i++);

        String s1 = new String("Demo");
        String s2 = new String("Demo");

        /*compare memory address==*/
        if (s1 == s2) {
            Log.e(TAG, "== --->");
        }
        /*compare value==*/
        if (s1.equals(s2)) {
            Log.e(TAG, "equals --->");
        }

        /*Pass by value*/
        PersonClass p1 = new PersonClass("Darshan", "26");
        PersonClass p2;

        p2 = p1;
        Log.e(TAG, "p2 Name " + p2.getName() + " and age" + p2.getAge());

        p2.setAge("33");
        p2.setName("Kushan");

        Log.e(TAG, "p1 Name " + p1.getName() + " and age" + p1.getAge());

        PersonClass variable3 = new PersonClass("Andre", "45");

        // variable1 now points to variable3
        p1 = variable3;

        Log.e(TAG, "p1 Name " + p1.getName() + " and age" + p1.getAge());
        Log.e(TAG, "p2 Name " + p2.getName() + " and age" + p2.getAge());
        Log.e(TAG, "variable3 Name " + variable3.getName() + " and age" + variable3.getAge());

        /*Downcasting start*/
        ParentClass p = new ParentClass();

        /*Below code through runtime exception*/
      /*  ChildClass c = (ChildClass) p;
        c.testMehotd();*/

        /*Below code give compile time error*/
//        ChildClass c1 = p;

        /*ChildClass c1 = new ChildClass();
        ChildClass c2 = new ChildClass();

        if (c1.equals(c2)) {

        }*/
        /*Downcating end*/

        /*Inner class demo start*/
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.method2();
        /*Inner class demo end*/

        /*Nested class demo start*/
        NestedClassVsInnerClass.NestesClass objStatic = new NestedClassVsInnerClass.NestesClass();
        objStatic.demo1();
        /*Nested class demo end*/

         /*Annonamays inner start*/
        AnnonymasInnerClass annonymasInnerClass = new AnnonymasInnerClass();
        annonymasInnerClass.annonaymasInterface();
        /*Annonamays inner end*/

        /*Annonamays inner with argument start*/
        ArgsAnnomyasInnerClass argsAnnomyasInnerClass = new ArgsAnnomyasInnerClass();
        argsAnnomyasInnerClass.exampleMethod(new ArgsAnnomyasInnerClass.ExampleInterface() {
            @Override
            public void interfaceMethod() {
                Log.e(TAG, "interfaceMethod: This is argumented annoynamous inner class");
            }
        });
        /*Annonamays inner with argument end*/
    }
}
