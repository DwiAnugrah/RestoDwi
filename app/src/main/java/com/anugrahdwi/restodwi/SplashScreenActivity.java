package com.anugrahdwi.restodwi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

// NIM : 10120073
// NAMA : Anugrah Dwi Wicaksono
// KELAS : IF-2
public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, SlideActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
