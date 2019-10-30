package com.example.a20dice

import androidx.appcompat.app.AppCompatActivity

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView

class ScoreActivity : AppCompatActivity() {
    private var score1: TextView? = null
    private var score2: TextView? = null
    private var score3: TextView? = null
    private var score4: TextView? = null
    private var score5: TextView? = null
    private var score6: TextView? = null
    private var score7: TextView? = null
    private var score8: TextView? = null
    private var score9: TextView? = null
    private var score10: TextView? = null
    private var score11: TextView? = null
    private var score12: TextView? = null
    private var score13: TextView? = null
    private var score14: TextView? = null
    private var score15: TextView? = null
    private var score16: TextView? = null
    private var score17: TextView? = null
    private var score18: TextView? = null
    private var score19: TextView? = null
    private var score20: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        score1 = findViewById(R.id.score_1)
        score2 = findViewById(R.id.score_2)
        score3 = findViewById(R.id.score_3)
        score4 = findViewById(R.id.score_4)
        score5 = findViewById(R.id.score_5)
        score6 = findViewById(R.id.score_6)
        score7 = findViewById(R.id.score_7)
        score8 = findViewById(R.id.score_8)
        score9 = findViewById(R.id.score_9)
        score10 = findViewById(R.id.score_10)
        score11 = findViewById(R.id.score_11)
        score12 = findViewById(R.id.score_12)
        score13 = findViewById(R.id.score_13)
        score14 = findViewById(R.id.score_14)
        score15 = findViewById(R.id.score_15)
        score16 = findViewById(R.id.score_16)
        score17 = findViewById(R.id.score_17)
        score18 = findViewById(R.id.score_18)
        score19 = findViewById(R.id.score_19)
        score20 = findViewById(R.id.score_20)

        val Preference = getSharedPreferences("SCORE", Context.MODE_PRIVATE)

        val s1 = Preference.getInt("1_score", 0)
        val s2 = Preference.getInt("2_score", 0)
        val s3 = Preference.getInt("3_score", 0)
        val s4 = Preference.getInt("4_score", 0)
        val s5 = Preference.getInt("5_score", 0)
        val s6 = Preference.getInt("6_score", 0)
        val s7 = Preference.getInt("7_score", 0)
        val s8 = Preference.getInt("8_score", 0)
        val s9 = Preference.getInt("9_score", 0)
        val s10 = Preference.getInt("10_score", 0)
        val s11 = Preference.getInt("11_score", 0)
        val s12 = Preference.getInt("12_score", 0)
        val s13 = Preference.getInt("13_score", 0)
        val s14 = Preference.getInt("14_score", 0)
        val s15 = Preference.getInt("15_score", 0)
        val s16 = Preference.getInt("16_score", 0)
        val s17 = Preference.getInt("17_score", 0)
        val s18 = Preference.getInt("18_score", 0)
        val s19 = Preference.getInt("19_score", 0)
        val s20 = Preference.getInt("20_score", 0)

        score1!!.text = "1 rolled : " + Integer.toString(s1)
        score2!!.text = "2 rolled : " + Integer.toString(s2)
        score3!!.text = "3 rolled : " + Integer.toString(s3)
        score4!!.text = "4 rolled : " + Integer.toString(s4)
        score5!!.text = "5 rolled : " + Integer.toString(s5)
        score6!!.text = "6 rolled : " + Integer.toString(s6)
        score7!!.text = "7 rolled : " + Integer.toString(s7)
        score8!!.text = "8 rolled : " + Integer.toString(s8)
        score9!!.text = "9 rolled : " + Integer.toString(s9)
        score10!!.text = "10 rolled : " + Integer.toString(s10)
        score11!!.text = "11 rolled : " + Integer.toString(s11)
        score12!!.text = "12 rolled : " + Integer.toString(s12)
        score13!!.text = "13 rolled : " + Integer.toString(s13)
        score14!!.text = "14 rolled : " + Integer.toString(s14)
        score15!!.text = "15 rolled : " + Integer.toString(s15)
        score16!!.text = "16 rolled : " + Integer.toString(s16)
        score17!!.text = "17 rolled : " + Integer.toString(s17)
        score18!!.text = "18 rolled : " + Integer.toString(s18)
        score19!!.text = "19 rolled : " + Integer.toString(s19)
        score20!!.text = "20 rolled : " + Integer.toString(s20)


    }


}
