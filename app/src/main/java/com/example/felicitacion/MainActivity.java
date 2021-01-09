package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.startAnimation(animacion);

        Animation slideUp = AnimationUtils.loadAnimation(this,R.anim.slideup);
        TextView texto1 = (TextView) findViewById(R.id.textView1);
        TextView texto2 = (TextView) findViewById(R.id.textView2);
        texto1.startAnimation(slideUp);
        texto2.startAnimation(slideUp);

        Typeface myFuente = Typeface.createFromAsset(getAssets(),"beauty_beast.ttf");
        texto1.setTypeface(myFuente);
        texto2.setTypeface(myFuente);


        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happy_birthday);
        mediaPlayer.start();
    }
}