package com.zdmitrij.crosszero;

import java.util.Random;
import java.util.Scanner;

//поле
public class Field {

    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Random random;
    Scanner scanner;

    // конструктор поля, создание массива 3*3
    Field() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }



}
