package com.zdmitrij.crosszero;

public class GameRunner {

    public static void main(String[] args) {
        Field field = new Field();
        GameLogic gamelogic = new GameLogic();
        gamelogic.gameRunner(field.table);
    }



}
