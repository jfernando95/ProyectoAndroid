package com.example.kamran.bluewhite;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private final int duracion = 2000;//tiempo que tarda mi imagen de inicio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,signin.class);
                startActivity(intent);
                finish();
            };
            },duracion
        );//postDelayed para llamar a otra Actividad
    }
}
