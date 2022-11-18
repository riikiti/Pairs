package com.example.pairs;

public class Board {
    private int stepsCount;
    private int stepsFinish;
    private boolean winOrLose;
    private int[][] board = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    private int[] cards = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

    public Board() {
        int tempNumber;
        int i = 0, j = 0;
        while (this.board[i][j] == -1) {
            tempNumber = (int) (Math.random() * 12);
            if (cards[tempNumber] != -1) {
                this.board[i][j] = cards[tempNumber];
                cards[tempNumber] = -1;
            } else {
                int ii = 0;
                while (cards[ii] == -1) {
                    ii++;
                    tempNumber = ii;
                }
                this.board[i][j] = cards[tempNumber];
                cards[tempNumber] = -1;
            }
            j++;
            if (j == 3) {
                i++;
                j = 0;
            }
            if (i == 4) {
                break;
            }
        }
    }
    public int[][] getBoard() {
        return board;
    }
}
