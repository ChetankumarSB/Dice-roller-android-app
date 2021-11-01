package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView dice;
    private Random randomNum = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice = findViewById(R.id.diceImage);
        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollMyDice();
            }
        });

    }

    private void rollMyDice(){
        int myNumber = randomNum.nextInt(6) + 1;

        switch (myNumber) {
            case 1:
                dice.setImageResource(R.drawable.dice01);
                break;
            case 2:
                dice.setImageResource(R.drawable.dice02);
                break;
            case 3:
                dice.setImageResource(R.drawable.dice03);
                break;
            case 4:
                dice.setImageResource(R.drawable.dice04);
                break;
            case 5:
                dice.setImageResource(R.drawable.dice05);
                break;
            case 6:
                dice.setImageResource(R.drawable.dice06);
                break;
        }
    }
}