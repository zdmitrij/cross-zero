package com.zdmitrij.crosszero;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    boolean gameover = false;

    // метод игровой логики
    public void gameRunner() {
        do {


            gameoverCheck();
        } while (!gameover);
    }
        boolean gameoverCheck() {
            for (int i = 0; i < 3; i++) {
                if (table[i][0] == table[i][1] == table[i][2]) != '.' ||
                table[0][i] == table[1][i] == table[2][0] != '.') {
                    gameover == true;
                    return gameover;
                    break;
                }
            }
        }
}