package com.example.pairs;

import java.util.ArrayList;
import java.util.Random;

public class Board {
    private int stepsCount;
    private int stepsFinish;
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
}
