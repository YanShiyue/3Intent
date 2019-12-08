package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button bt_first=(Button)findViewById(R.id.bt_first);
        bt_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//隐式启动SecondActivity
                Intent intent=new Intent("com.example.intent.ACTION_START");
                startActivity(intent);
            }
        });
    }
}
