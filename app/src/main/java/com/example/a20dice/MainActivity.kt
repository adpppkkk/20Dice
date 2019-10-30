package com.example.a20dice

import androidx.appcompat.app.AppCompatActivity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.SoundPool
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import java.util.Random

class MainActivity : AppCompatActivity() {
    private var imageViewDice: ImageView? = null
    private var textview: TextView? = null
    private val rng = Random()
    private val scorepage: Button? = null
    internal var sound1: Int = 0
    internal var sound2: Int = 0
    internal var sound3: Int = 0
    private val MySoundPool = SoundPool(3, 0, 5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sound1 = MySoundPool.load(this, R.raw.diceroll, 1)
        sound2 = MySoundPool.load(this, R.raw.firstsound, 1)
        sound3 = MySoundPool.load(this, R.raw.finalsound, 1)
        imageViewDice = findViewById(R.id.image_view_dice)
        textview = findViewById(R.id.textView)
        imageViewDice!!.setOnClickListener {
            MySoundPool.play(sound1, 1f, 1f, 0, 0, 1f)
            rollDice()
        }

        val scorepage = findViewById<Button>(R.id.Score)
        scorepage.setOnClickListener { openScorepage() }


    }


    fun openScorepage() {
        val intent = Intent(this, ScoreActivity::class.java)
        startActivity(intent)
    }


    private fun rollDice() {
        val randomNumber = rng.nextInt(20) + 1

        val Preference = getSharedPreferences("SCORE", Context.MODE_PRIVATE)
        var number_rolled = Preference.getInt(Integer.toString(randomNumber) + "_score", 0)
        number_rolled++

        val editor = Preference.edit()
        editor.putInt(Integer.toString(randomNumber) + "_score", number_rolled)
        editor.commit()

        when (randomNumber) {
            1 -> {
                imageViewDice!!.setImageResource(R.drawable.dice1)
                textview!!.setText(R.string.text_criticalM)
                textview!!.setTextColor(textview!!.resources.getColorStateList(R.color.Badluck))
                MySoundPool.play(sound2, 1f, 1f, 0, 0, 1f)
            }
            2 -> {
                imageViewDice!!.setImageResource(R.drawable.dice2)
                textview!!.setText(R.string.plain)
            }
            3 -> {
                imageViewDice!!.setImageResource(R.drawable.dice3)
                textview!!.setText(R.string.plain)
            }
            4 -> {
                imageViewDice!!.setImageResource(R.drawable.dice4)
                textview!!.setText(R.string.plain)
            }
            5 -> {
                imageViewDice!!.setImageResource(R.drawable.dice5)
                textview!!.setText(R.string.plain)
            }
            6 -> {
                imageViewDice!!.setImageResource(R.drawable.dice6)
                textview!!.setText(R.string.plain)
            }
            7 -> {
                imageViewDice!!.setImageResource(R.drawable.dice7)
                textview!!.setText(R.string.plain)
            }
            8 -> {
                imageViewDice!!.setImageResource(R.drawable.dice8)
                textview!!.setText(R.string.plain)
            }
            9 -> {
                imageViewDice!!.setImageResource(R.drawable.dice9)
                textview!!.setText(R.string.plain)
            }
            10 -> {
                imageViewDice!!.setImageResource(R.drawable.dice10)
                textview!!.setText(R.string.plain)
            }
            11 -> {
                imageViewDice!!.setImageResource(R.drawable.dice11)
                textview!!.setText(R.string.plain)
            }
            12 -> {
                imageViewDice!!.setImageResource(R.drawable.dice12)
                textview!!.setText(R.string.plain)
            }
            13 -> {
                imageViewDice!!.setImageResource(R.drawable.dice13)
                textview!!.setText(R.string.plain)
            }
            14 -> {
                imageViewDice!!.setImageResource(R.drawable.dice14)
                textview!!.setText(R.string.plain)
            }
            15 -> {
                imageViewDice!!.setImageResource(R.drawable.dice15)
                textview!!.setText(R.string.plain)
            }
            16 -> {
                imageViewDice!!.setImageResource(R.drawable.dice16)
                textview!!.setText(R.string.plain)
            }
            17 -> {
                imageViewDice!!.setImageResource(R.drawable.dice17)
                textview!!.setText(R.string.plain)
            }
            18 -> {
                imageViewDice!!.setImageResource(R.drawable.dice18)
                textview!!.setText(R.string.plain)
            }
            19 -> {
                imageViewDice!!.setImageResource(R.drawable.dice19)
                textview!!.setText(R.string.plain)
            }
            20 -> {
                imageViewDice!!.setImageResource(R.drawable.dice20)
                textview!!.setText(R.string.text_criticalH)
                textview!!.setTextColor(textview!!.resources.getColorStateList(R.color.Lucky))
                MySoundPool.play(sound3, 1f, 1f, 0, 0, 1f)
            }
        }
    }
}
