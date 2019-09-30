package com.example.a20dice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    private TextView score1,score2,score3,score4,score5,score6,score7,score8,score9,score10,score11,score12,score13,score14,score15,score16,score17,score18,score19,score20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        score1 = findViewById(R.id.score_1);
        score2 = findViewById(R.id.score_2);
        score3 = findViewById(R.id.score_3);
        score4 = findViewById(R.id.score_4);
        score5 = findViewById(R.id.score_5);
        score6 = findViewById(R.id.score_6);
        score7 = findViewById(R.id.score_7);
        score8 = findViewById(R.id.score_8);
        score9 = findViewById(R.id.score_9);
        score10 = findViewById(R.id.score_10);
        score11 = findViewById(R.id.score_11);
        score12 = findViewById(R.id.score_12);
        score13 = findViewById(R.id.score_13);
        score14 = findViewById(R.id.score_14);
        score15 = findViewById(R.id.score_15);
        score16 = findViewById(R.id.score_16);
        score17 = findViewById(R.id.score_17);
        score18 = findViewById(R.id.score_18);
        score19 = findViewById(R.id.score_19);
        score20 = findViewById(R.id.score_20);

        SharedPreferences Preference = getSharedPreferences("SCORE", Context.MODE_PRIVATE);

        int s1 = Preference.getInt("1_score",0);
        int s2 = Preference.getInt("2_score",0);
        int s3 = Preference.getInt("3_score",0);
        int s4 = Preference.getInt("4_score",0);
        int s5 = Preference.getInt("5_score",0);
        int s6 = Preference.getInt("6_score",0);
        int s7 = Preference.getInt("7_score",0);
        int s8 = Preference.getInt("8_score",0);
        int s9 = Preference.getInt("9_score",0);
        int s10 = Preference.getInt("10_score",0);
        int s11 = Preference.getInt("11_score",0);
        int s12 = Preference.getInt("12_score",0);
        int s13 = Preference.getInt("13_score",0);
        int s14 = Preference.getInt("14_score",0);
        int s15 = Preference.getInt("15_score",0);
        int s16 = Preference.getInt("16_score",0);
        int s17 = Preference.getInt("17_score",0);
        int s18 = Preference.getInt("18_score",0);
        int s19 = Preference.getInt("19_score",0);
        int s20 = Preference.getInt("20_score",0);

        score1.setText("1 rolled : "+Integer.toString(s1));
        score2.setText("2 rolled : "+Integer.toString(s2));
        score3.setText("3 rolled : "+Integer.toString(s3));
        score4.setText("4 rolled : "+Integer.toString(s4));
        score5.setText("5 rolled : "+Integer.toString(s5));
        score6.setText("6 rolled : "+Integer.toString(s6));
        score7.setText("7 rolled : "+Integer.toString(s7));
        score8.setText("8 rolled : "+Integer.toString(s8));
        score9.setText("9 rolled : "+Integer.toString(s9));
        score10.setText("10 rolled : "+Integer.toString(s10));
        score11.setText("11 rolled : "+Integer.toString(s11));
        score12.setText("12 rolled : "+Integer.toString(s12));
        score13.setText("13 rolled : "+Integer.toString(s13));
        score14.setText("14 rolled : "+Integer.toString(s14));
        score15.setText("15 rolled : "+Integer.toString(s15));
        score16.setText("16 rolled : "+Integer.toString(s16));
        score17.setText("17 rolled : "+Integer.toString(s17));
        score18.setText("18 rolled : "+Integer.toString(s18));
        score19.setText("19 rolled : "+Integer.toString(s19));
        score20.setText("20 rolled : "+Integer.toString(s20));



    }



}
