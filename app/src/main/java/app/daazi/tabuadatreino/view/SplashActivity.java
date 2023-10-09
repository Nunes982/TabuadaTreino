package app.daazi.tabuadatreino.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import app.daazi.tabuadatreino.R;
import app.daazi.tabuadatreino.api.AppUtil;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iniciarAplicativo();

    }

    private void iniciarAplicativo() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, TabuadaActivity.class);


                startActivity(intent);
                finish();
            }
        }, AppUtil.TIME_SPLASH);
    }

}