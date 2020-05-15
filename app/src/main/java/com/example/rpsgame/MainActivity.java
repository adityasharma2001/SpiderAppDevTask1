package com.example.rpsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button single,multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        single = (Button) findViewById(R.id.singlebtn);
        multi = (Button) findViewById(R.id.multibtn);
        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singleGame();

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiGame();
            }
        });
    }
    public void singleGame(){
        Intent intent = new Intent(MainActivity.this , singleActivity.class);
        startActivity(intent);

    }
    public void multiGame(){
        Intent intent = new Intent(MainActivity.this , multiActivity.class);
        startActivity(intent);
    }
}
