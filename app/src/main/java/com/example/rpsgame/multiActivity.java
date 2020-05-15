package com.example.rpsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class multiActivity extends AppCompatActivity {


    private Button start;
    private EditText p1,p2,rounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);

        start = (Button) findViewById(R.id.start);
        p1 = (EditText) findViewById(R.id.p1);
        p2 = (EditText) findViewById(R.id.p2);
        rounds = (EditText) findViewById(R.id.rounds);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game();
            }
        });
    }

    public  void game(){
        String player1 = p1.getText().toString();
        String player2 = p2.getText().toString();
        int round = Integer.parseInt(rounds.getText().toString());
        Intent intent = new Intent(multiActivity.this , gameActivity.class);
        intent.putExtra("player1",player1);
        intent.putExtra("player2",player2);
        intent.putExtra("rounds",round);
        startActivity(intent);
    }
}
