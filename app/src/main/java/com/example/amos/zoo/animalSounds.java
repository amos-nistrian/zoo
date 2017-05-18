package com.example.amos.zoo;

import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.ImageButton;

public class animalSounds extends AppCompatActivity {

    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_sounds);

        final ImageButton b1 = (ImageButton) findViewById(R.id.zebraButton);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.zebra);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                anim = AnimationUtils.loadAnimation(animalSounds.this, R.anim.shake);
                b1.startAnimation(anim);
                mp1.start();
            }
        });


        final ImageButton b2 = (ImageButton) findViewById(R.id.lionButton);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.lion);

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                anim = AnimationUtils.loadAnimation(animalSounds.this, R.anim.shake);
                b2.startAnimation(anim);
                mp2.start();
            }
        });

        final ImageButton b3 = (ImageButton) findViewById(R.id.sealButton);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.seal);

        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                anim = AnimationUtils.loadAnimation(animalSounds.this, R.anim.shake);
                b3.startAnimation(anim);
                mp3.start();

            }
        });

        final ImageButton b4 = (ImageButton) findViewById(R.id.elephantButton);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.elephant);

        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                anim = AnimationUtils.loadAnimation(animalSounds.this, R.anim.shake);
                b4.startAnimation(anim);
                mp4.start();

            }
        });

        final ImageButton b5 = (ImageButton) findViewById(R.id.duckButton);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.duck);

        b5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                anim = AnimationUtils.loadAnimation(animalSounds.this, R.anim.shake);
                b5.startAnimation(anim);
                mp5.start();

            }
        });

        final ImageButton b6 = (ImageButton) findViewById(R.id.monkeyButton);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.monkey);

        b6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                anim = AnimationUtils.loadAnimation(animalSounds.this, R.anim.shake);
                b6.startAnimation(anim);
                mp6.start();

            }
        });

    }// oncreate
}// class
