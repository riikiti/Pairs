package com.example.pairs;

import android.widget.ImageView;

public class Couple {
    private int firstCard; // id picture (getdraweble)
    private int secondCard; // id picture
    private boolean equal;
    private ImageView img1;
    private ImageView img2;


    public Couple() {
   this.firstCard=-1;
   this.secondCard=-2;
    }

    public int getFirstCard() {
        return firstCard;
    }

    public void setFirstCard(int firstCard) {
        this.firstCard = firstCard;
    }

    public int getSecondCard() {
        return secondCard;
    }

    public void setSecondCard(int secondCard) {
        this.secondCard = secondCard;
    }

    public boolean isEqual() {
        return firstCard == secondCard? true : false;
    }

    public ImageView getImg1() {
        return img1;
    }

    public void setImg1(ImageView img1) {
        this.img1 = img1;
    }

    public ImageView getImg2() {
        return img2;
    }

    public void setImg2(ImageView img2) {
        this.img2 = img2;
    }
}
