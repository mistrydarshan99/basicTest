package com.example.darshanmistry.camera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.darshanmistry.camera.launchmode.Activity_launch_standard;

public class ContentActivity extends AppCompatActivity {

    private Button btnLifeCycle, btnFragmentLifeCycle, btnAccess, btnLaunchMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

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
}
