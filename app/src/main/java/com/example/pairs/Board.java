package com.example.pairs;

import java.util.ArrayList;
import java.util.Random;

public class Board {
    private int stepsCount=0;
    private int stepsFinish=16;
    private boolean winOrLose;
    private int[][] board = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    private int[] cards = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
    private ArrayList<Couple> couples = new ArrayList<Couple>();

    public Board() {
        int index, temp;
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = cards[count];
                count++;
            }
        }
    }


    public int[][] getBoard() {
        return board;
    }

    public void addCouple(Couple couple) {
        this.couples.add(couple);
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    public boolean Finish(){
        return stepsCount==stepsFinish?true:false;
    }

    public  int GetLen(){
        return couples.size();
    }
}