package com.zdmitrij.crosszero;

import java.util.Arrays;
import java.util.Scanner;

public class GameLogic {
    private final Field field = new Field();

    private final Scanner scanner = new Scanner(System.in);
    private final String FIELD_X = "X";
    private final String FIELD_O = "O";
    private final String EMPTY = ".";

    public void start() {
        fillValues();
        while (true) {
            Integer firstPlayerInput = makeFirstPlayerMove();
            field.getValues()[firstPlayerInput - 1] = FIELD_X;
            field.showField();
            checkWinner();
            Integer secondPlayerInput = makeSecondPlayerMove();
            field.getValues()[secondPlayerInput - 1] = FIELD_O;
            field.showField();
            checkWinner();
        }

    }

    private void fillValues() {
        Arrays.fill(field.getValues(), EMPTY);
    }

    private Integer makeFirstPlayerMove() {
        System.out.println("Enter value X");
        field.showField();
        Integer choice = scanner.nextInt();
        while (validateInput(choice)) {
            System.out.println("Enter value X again");
            field.showField();
            choice = scanner.nextInt();
        }
        return choice;
    }

    private Integer makeSecondPlayerMove() {
        System.out.println("Enter value 0");
        field.showField();
        Integer choice = scanner.nextInt();
        while (validateInput(choice)) {
            System.out.println("Enter value 0 again");
            field.showField();
            choice = scanner.nextInt();
        }

        return choice;
    }

    private boolean validateInput(Integer input) {

        return  field.getValues()[input] != EMPTY ||  (input < 1 || input > 9);
    }

    private void checkWinner() {
        if (field.getValues()[0] == field.getValues()[1] && field.getValues()[1] == field.getValues()[2])  {
            System.out.println(FIELD_X + " - YOU WIN !");
            System.exit(0);
        }
    }
}

// НЕ ДОПУСКАТЬ ПЕРЕЗАПИСИ ЗАПОЛНЕННОЙ ЯЧЕЙКИ!
