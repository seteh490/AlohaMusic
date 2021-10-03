 package com.example.alohamusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    MediaPlayer mpUkulele, mpDrums, mpBagpipe;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btnUkulele);
        button2 = (Button) findViewById(R.id.btnDrums);
        button3 = (Button) findViewById(R.id.btnBagpipe);

        button1.setOnClickListener(bUkulele);
        button2.setOnClickListener(bDrums);
        button3.setOnClickListener(bBagpipe);

        mpUkulele = new MediaPlayer();
        mpUkulele = MediaPlayer.create(this, R.raw.ukulele);

        mpDrums = new MediaPlayer();
        mpDrums = MediaPlayer.create(this, R.raw.drums);

        mpBagpipe = new MediaPlayer();
        mpBagpipe = MediaPlayer.create(this, R.raw.bagpipes);

        playing = 0;


    }

    View.OnClickListener bUkulele = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (playing) {
                case 0:
                    //start() begins the ukulele song
                    mpUkulele.start();
                    playing = 1;
                    button1.setText("Pause Ukulele Song");
                    //button2.setVisibility(View.INVISIBLE);
                    break;

                case 1:
                    mpUkulele.pause();
                    playing = 0;
                    //setText() changes the button text
                    button1.setText("Play Ukulele Song");
                    //button2.setVisibility(View.VISIBLE);
                    break;
            }

        }

    };
    View.OnClickListener bDrums = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            switch (playing) {
                case 0:
                    //start() begins the Drums song
                    mpDrums.start();
                    playing = 1;
                    button2.setText("Pause Drums Song");
                    //button2.setVisibility(View.INVISIBLE);
                    break;

                case 1:
                    mpDrums.pause();
                    playing = 0;
                    //setText() changes the button text
                    button2.setText("Play Drums Song");
                    //button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
    View.OnClickListener bBagpipe = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (playing) {
                case 0:
                    //start() begins the ukulele song
                    mpBagpipe.start();
                    playing = 1;
                    button3.setText("Pause Bagpipe Song");
                    //button2.setVisibility(View.INVISIBLE);
                    break;

                case 1:
                    mpBagpipe.pause();
                    playing = 0;
                    //setText() changes the button text
                    button3.setText("Play Bagpipe Song");
                    //button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };

}