package com.example.alc4challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button alc,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alc=findViewById(R.id.aboutalc);
        profile=findViewById(R.id.profile);
        alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent andela=new Intent(getApplicationContext(),alc.class);
                startActivity(andela);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent me=new Intent(getApplicationContext(),me.class);
                startActivity(me);
            }
        });
    }
}
