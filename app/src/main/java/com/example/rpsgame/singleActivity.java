package com.example.rpsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class singleActivity extends AppCompatActivity {
    Button stone, paper, scissors;
    TextView score;
    ImageView computerChoice, userChoice;
    View view;

    int userScore = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);

        stone = (Button) findViewById(R.id.stone);
        paper = (Button) findViewById(R.id.p1paper);
        scissors = (Button) findViewById(R.id.scissor);

        computerChoice = (ImageView) findViewById(R.id.computerChoice);
        userChoice = (ImageView) findViewById(R.id.userChoice);

        score = (TextView) findViewById(R.id.score);

        view = (View) findViewById(R.id.view);

        stone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userChoice.setImageResource(R.drawable.rock);
                String message = play_turn("rock");
                Toast.makeText(singleActivity.this,message,Toast.LENGTH_SHORT).show();
                score.setText("Score:" + Integer.toString(userScore));
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userChoice.setImageResource(R.drawable.paper);
                String message = play_turn("paper");
                Toast.makeText(singleActivity.this,message,Toast.LENGTH_SHORT).show();
                score.setText("Score:" + Integer.toString(userScore));
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userChoice.setImageResource(R.drawable.scissors);
                String message = play_turn("scissor");
                Toast.makeText(singleActivity.this,message,Toast.LENGTH_SHORT).show();
                score.setText("Score:" + Integer.toString(userScore));
            }
        });

    }

    public String play_turn( String user_choice){
        String computer_choice = "";
        Random r = new Random();

        int computer_choice_num = r.nextInt(3) + 1;

        if(computer_choice_num == 1){
            computer_choice = "rock";
            computerChoice.setImageResource(R.drawable.rock);
        }
        else if(computer_choice_num == 2){
            computer_choice = "paper";
            computerChoice.setImageResource(R.drawable.paper);
        }
        else if(computer_choice_num == 3){
            computer_choice = "scissor";
            computerChoice.setImageResource(R.drawable.scissors);
        }

        if(computer_choice == user_choice){
            return "DRAW";
        }
        else if(user_choice == "rock" && computer_choice == "scissor"){
            view.setBackgroundColor(Color.parseColor("#008000"));
            userScore++;
            return "You Win!!!";
        }
        else if(user_choice == "paper" && computer_choice == "rock"){
            view.setBackgroundColor(Color.parseColor("#008000"));
            userScore++;
            return "You Win!!!";
        }
        else if(user_choice == "scissor" && computer_choice == "paper"){
            view.setBackgroundColor(Color.parseColor("#008000"));
            userScore++;
            return "You Win!!!";
        }
        else if(user_choice == "rock" && computer_choice == "paper"){
            view.setBackgroundColor(Color.parseColor("#FF0000"));
            return "You Lose!!!";
        }
        else if(user_choice == "scissor" && computer_choice == "rock"){
            view.setBackgroundColor(Color.parseColor("#FF0000"));
            return "You Lose!!!";
        }
        else if(user_choice == "paper" && computer_choice == "scissor"){
            view.setBackgroundColor(Color.parseColor("#FF0000"));
            return "You Lose!!!";
        }
        else return "not sure";

    }
}
