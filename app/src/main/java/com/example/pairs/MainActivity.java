package com.example.pairs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img0, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11;
    Board board;
    int steps = 0;
    Couple couple = new Couple();
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        board = new Board();
        board.getBoard();
        /*intilize views*/
        img0 = findViewById(R.id.imageView0);
        img1 = findViewById(R.id.imageView1);
        img2 = findViewById(R.id.imageView2);
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);
        img5 = findViewById(R.id.imageView5);
        img6 = findViewById(R.id.imageView6);
        img7 = findViewById(R.id.imageView7);
        img8 = findViewById(R.id.imageView8);
        img9 = findViewById(R.id.imageView9);
        img10 = findViewById(R.id.imageView10);
        img11 = findViewById(R.id.imageView11);


        /*set on click listener*/
        img0.setOnClickListener(this);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        img10.setOnClickListener(this);
        img11.setOnClickListener(this);


        /*set tag*/
        img0.setTag("0");
        img1.setTag("1");
        img2.setTag("2");
        img3.setTag("3");
        img4.setTag("4");
        img5.setTag("5");
        img6.setTag("6");
        img7.setTag("7");
        img8.setTag("8");
        img9.setTag("9");
        img10.setTag("10");
        img11.setTag("11");

    }


    @Override
    public void onClick(View view) {

if (steps==2){
    couple=new Couple();
    steps=0;
}
        ImageView img;
        switch (Integer.parseInt((String) view.getTag())) {
            case 0 :
                img = img0;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        couple=new Couple();
                        board.addCouple(couple);
                    }
                    else{
                      //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
            case 1 :
                img = img1;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){
                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;

            case 2 :
                img = img2;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
            case 3 :
                img = img3;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
            case 4 :
                img = img4;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
            case 5 :
                img = img5;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
            case 6 :
                img = img6;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
            case 7 :
                img = img7;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
            case 8 :
                img = img8;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
            case 9 :
                img = img9;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
            case 10 :
                img = img10;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
            case 11 :
                img = img11;
                steps++;
                img.setImageDrawable( GetImg(board.getBoard(), Integer.parseInt((String) view.getTag()) / 3, Integer.parseInt((String) view.getTag()) % 3));
                if (steps==1){
                    couple.setImg1(img);
                    couple.setFirstCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                }
                if(steps==2){

                    if (couple.getImg1()==img){
                        break;
                    }

                    couple.setSecondCard(board.getBoard()[Integer.parseInt((String) view.getTag()) / 3][Integer.parseInt((String) view.getTag()) % 3]);
                    couple.setImg2(img);
                    if (couple.isEqual()){
                        board.addCouple(couple);
                        couple=new Couple();
                    }
                    else{
                        //  Pause();
                        couple.getImg1().setImageDrawable(getDrawable(R.drawable.card));
                        couple.getImg2().setImageDrawable(getDrawable(R.drawable.card));
                    }
                }

                break;
        }

    }

    public Drawable GetImg(int[][] board, int i, int j) {
        Drawable drawableCard = getDrawable(R.drawable.card);
        switch (board[i][j]) {
            case 0:
                drawableCard = getDrawable(R.drawable.ace);
                break;
            case 1:
                drawableCard = getDrawable(R.drawable.king);
                break;
            case 2:
                drawableCard = getDrawable(R.drawable.queen);
                break;
            case 3:
                drawableCard = getDrawable(R.drawable.jack);
                break;
            case 4:
                drawableCard = getDrawable(R.drawable.ten);
                break;
            case 5:
                drawableCard = getDrawable(R.drawable.joker);
                break;
        }
        return drawableCard;
    }


    public void Pause(){
        new CountDownTimer( 1000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
            }

        }.start();
    }


}