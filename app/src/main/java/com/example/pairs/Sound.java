package com.example.pairs;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;

import java.io.IOException;
import java.io.Serializable;

public class Sound implements Serializable {
    private static MediaPlayer
            soundGame = new MediaPlayer(),
            soundTurn = new MediaPlayer();
    private int pauseTime;

    Sound() {}

    public void start(View.OnClickListener con) {
          soundGame = MediaPlayer.create((Context) con, R.raw.music);
        soundGame.setLooping(true);
        soundTurn = MediaPlayer.create((Context) con, R.raw.click);
    }

    public void gameStart() {
        soundGame.start();
        soundGame.seekTo(pauseTime);
    }

    public void turnStart() {
        soundTurn.stop();
        try {
            soundTurn.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        soundTurn.start();
    }
    public void gamePause() {
        pauseTime = soundGame.getCurrentPosition();
        soundGame.pause();
    }

    /*public int getPauseTime() { return pauseTime; }

    public void gameStop() {
        soundGame.stop();
        try {
            soundGame.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
