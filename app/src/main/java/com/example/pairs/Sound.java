package com.example.pairs;

import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;

import java.io.IOException;
import java.io.Serializable;

public class Sound implements Serializable {
    private static MediaPlayer
            soundGame = new MediaPlayer(),
            soundTurn = new MediaPlayer(),
            soundWin = new MediaPlayer();
    private int pauseTime;

    Sound() {}

    public void start(Context con) {
        soundGame = MediaPlayer.create(con, R.raw.game);
        soundGame.setLooping(true);
        soundTurn = MediaPlayer.create(con, R.raw.turn);
        soundWin = MediaPlayer.create(con, R.raw.win);
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

    public void winStart() { soundWin.start(); }

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
