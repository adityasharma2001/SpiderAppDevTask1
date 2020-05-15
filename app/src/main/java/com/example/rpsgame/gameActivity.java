package com.example.rpsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class gameActivity extends AppCompatActivity {
    private String player1;
    private String player2;
    private int round;
    int p1score = 0;
    int p2score = 0;
    String p1choice;
    String p2choice;
    Button p1stone,p1paper,p1scissor,p2stone,p2paper,p2scissor;
    ImageView p1img,p2img;
    View p1view,p2view;
    int p1=0;
    int p2=0;
    int i =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        player1 = getIntent().getExtras().get("player1").toString();
        player2 = getIntent().getExtras().get("player2").toString();
        round = (int) getIntent().getExtras().get("rounds");


        p1stone = (Button) findViewById(R.id.p1stone);
        p1paper = (Button) findViewById(R.id.p1paper);
        p1scissor = (Button) findViewById(R.id.p1scissor);
        p2stone = (Button) findViewById(R.id.p2stone);
        p2paper = (Button) findViewById(R.id.p2paper);
        p2scissor = (Button) findViewById(R.id.p2scissor);

        p1img = (ImageView) findViewById(R.id.p1img);
        p2img = (ImageView) findViewById(R.id.p2img);

        p1view = (View) findViewById(R.id.p1view);
        p2view = (View) findViewById(R.id.p2view);


        p1stone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1img.setImageResource(R.drawable.rock);
                p1choice = "stone";
                p1=1;
                if((p1==1)&&(p2==1)){
                    if(i<round) {
                        startGame(p1choice, p2choice);
                    }
                }
                else{
                    if(i==round){
                        result(p1score,p2score);
                    }
                }

            }
        });

        p1paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1img.setImageResource(R.drawable.paper);
                p1choice = "paper";
                p1=1;
                if((p1==1)&&(p2==1)){
                    if(i<round) {
                        startGame(p1choice, p2choice);
                    }
                }
                else{
                    if(i==round){
                        result(p1score,p2score);
                    }
                }

            }
        });

        p1scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1img.setImageResource(R.drawable.scissors);
                p1choice = "scissor";
                p1=1;
                if((p1==1)&&(p2==1)){
                    if(i<round) {
                        startGame(p1choice, p2choice);
                    }
                }
                else{
                    if(i==round){
                        result(p1score,p2score);
                    }
                }

            }
        });

        p2stone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2img.setImageResource(R.drawable.rock);
                p2choice = "stone";
                p2=1;
                if((p1==1)&&(p2==1)){
                    if(i<round) {
                        startGame(p1choice, p2choice);
                    }
                }
                else{
                    if(i==round){
                        result(p1score,p2score);
                    }
                }

            }
        });

        p2paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2img.setImageResource(R.drawable.paper);
                p2choice = "paper";
                p2=1;
                if((p1==1)&&(p2==1)){
                    if(i<round) {
                        startGame(p1choice, p2choice);
                    }
                }
                else{
                    if(i==round){
                        result(p1score,p2score);
                    }
                }

            }
        });

        p2scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2img.setImageResource(R.drawable.scissors);
                p2choice = "scissor";
                p2=1;
                if((p1==1)&&(p2==1)){
                    if(i<round) {
                        startGame(p1choice, p2choice);
                    }
                }
                else{
                    if(i==round){
                        result(p1score,p2score);
                    }
                }

            }
        });

        /*if(p1score>p2score){
            String message = player1 + "wins";
            Toast.makeText(gameActivity.this,message,Toast.LENGTH_SHORT).show();
        }
        else if(p1score<p2score){
            String message = player2 + "wins";
            Toast.makeText(gameActivity.this,message,Toast.LENGTH_SHORT).show();
        }*/

    }

    public void startGame(String o, String t){
        if(o == t){
            p1view.setBackgroundColor(Color.parseColor("#FFFFFF"));
            p2view.setBackgroundColor(Color.parseColor("#FFFFFF"));
            p1=0;
            p2=0;
            i++;
        }
        else if( o == "stone" && t == "scissor"){
            p1view.setBackgroundColor(Color.parseColor("#008000"));
            p2view.setBackgroundColor(Color.parseColor("#FF0000"));
            p1score++;
            p1=0;
            p2=0;
            i++;
        }
        else if( o =="paper" && t == "stone"){
            p1view.setBackgroundColor(Color.parseColor("#008000"));
            p2view.setBackgroundColor(Color.parseColor("#FF0000"));
            p1score++;
            p1=0;
            p2=0;
            i++;
        }
        else if( o == "scissor" && t == "paper"){
            p1view.setBackgroundColor(Color.parseColor("#008000"));
            p2view.setBackgroundColor(Color.parseColor("#FF0000"));
            p1score++;
            p1=0;
            p2=0;
            i++;
        }
        else if( o == "stone" && t == "paper"){
            p1view.setBackgroundColor(Color.parseColor("#FF0000"));
            p2view.setBackgroundColor(Color.parseColor("#008000"));
            p2score++;
            p1=0;
            p2=0;
            i++;
        }
        else if( o == "paper" && t == "scissor"){
            p1view.setBackgroundColor(Color.parseColor("#FF0000"));
            p2view.setBackgroundColor(Color.parseColor("#008000"));
            p2score++;
            p1=0;
            p2=0;
            i++;
        }
        else if( o == "scissor" && t == "stone"){
            p1view.setBackgroundColor(Color.parseColor("#FF0000"));
            p2view.setBackgroundColor(Color.parseColor("#008000"));
            p2score++;
            p1=0;
            p2=0;
            i++;
        }
    }
    public void result(int a, int b){
        if(a>b){
            String message = player1 + "wins";
            Toast.makeText(gameActivity.this,message,Toast.LENGTH_SHORT).show();
        }
        else if(a<b){
            String message = player2 + "wins";
            Toast.makeText(gameActivity.this,message,Toast.LENGTH_SHORT).show();
        }
        else{
            String message = "DRAW";
            Toast.makeText(gameActivity.this,message,Toast.LENGTH_SHORT).show();
        }
    }
}
