package com.example.a20dice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private TextView textview;
    private Random rng = new Random();
    int sound1,sound2,sound3;
    private SoundPool MySoundPool = new SoundPool(3,0,5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sound1 =MySoundPool.load(this, R.raw.diceroll,1);
        sound2 =MySoundPool.load(this, R.raw.firstsound,1);
        sound3 =MySoundPool.load(this, R.raw.finalsound,1);
        imageViewDice = findViewById(R.id.image_view_dice);
        textview = findViewById(R.id.textView);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MySoundPool.play(sound1,1,1,0,0,1);
                rollDice();
            }
        });
    }


    private void rollDice() {
        int randomNumber = rng.nextInt(20) +1;

        switch (randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                textview.setText(R.string.text_criticalM);
                textview.setTextColor(textview.getResources().getColorStateList(R.color.Badluck));
                MySoundPool.play(sound2,1,1,0,0,1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                textview.setText(R.string.plain);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                textview.setText(R.string.plain);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                textview.setText(R.string.plain);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                textview.setText(R.string.plain);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                textview.setText(R.string.plain);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                textview.setText(R.string.plain);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                textview.setText(R.string.plain);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                textview.setText(R.string.plain);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                textview.setText(R.string.plain);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                textview.setText(R.string.plain);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                textview.setText(R.string.plain);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                textview.setText(R.string.plain);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                textview.setText(R.string.plain);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                textview.setText(R.string.plain);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                textview.setText(R.string.plain);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                textview.setText(R.string.plain);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                textview.setText(R.string.plain);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                textview.setText(R.string.plain);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                textview.setText(R.string.text_criticalH);
                textview.setTextColor(textview.getResources().getColorStateList(R.color.Lucky));
                MySoundPool.play(sound3,1,1,0,0,1);
                break;

        }
    }
}
