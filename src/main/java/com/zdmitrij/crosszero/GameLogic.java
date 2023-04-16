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
            field.getValues()[firstPlayerInput] = FIELD_X;
            checkWinner();
            Integer secondPlayerInput = makeSecondPlayerMove();
            field.getValues()[secondPlayerInput] = FIELD_O;
            checkWinner();
        }

    }

    private void fillValues() {
        Arrays.fill(field.getValues(), EMPTY);
    }

    private Integer makeFirstPlayerMove() {
        System.out.println("Enter value");
        field.showField();
        Integer choice = scanner.nextInt();
        while (validateInput(choice)) {
            System.out.println("Enter value");
            field.showField();
            choice = scanner.nextInt();
        }

        return choice;
    }

    private Integer makeSecondPlayerMove() {
        System.out.println("Enter value");
        field.showField();
        Integer choice = scanner.nextInt();
        while (validateInput(choice)) {
            System.out.println("Enter value");
            field.showField();
            choice = scanner.nextInt();
        }

        return choice;
    }

    private boolean validateInput(Integer input) {
        return input <= 0 || input > 8;
    }

    private void checkWinner() {
        System.out.println(FIELD_X);
        System.exit(0);
    }
}
