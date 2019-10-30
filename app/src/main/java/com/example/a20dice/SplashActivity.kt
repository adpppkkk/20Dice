package com.example.a20dice

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // as soon as THIS Activity loads, we know the APP has loaded, so
        // call for our Main Activity (MovieListActivity, in this case) to *** load up
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
