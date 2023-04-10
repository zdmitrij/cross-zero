package com.zdmitrij.crosszero;

import java.util.Scanner;

public class GameLogic {
    boolean gameover = false;
    int gamernumber = 1;
    boolean inputisincorrect = true;
    int linein;
    int columnin;

    // метод игровой логики
    public void gameRunner(char[][] tab) {
        do {
            //напечатать игровое поле
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + "|");
                for (int j = 0; j < 3; j++) {
                    System.out.print("  " + tab[i][j]);
                }
                System.out.println();
            }
            System.out.println("    1  2  3");

            //ввод данных пользователем и проверка ввода на корректность
            do {
                // вывести сообщение для пользователя 1 или 2 и получить его ввод
                //сделать сообщение - игрок 1 ваш ход X, игрок 2 ваш ход 0
                System.out.println("Игрок " + gamernumber + ", сделайте ваш ход.");
                System.out.println("Строка (1-3): ");
                Scanner scanner = new Scanner(System.in);
                int linein = scanner.nextInt();
                System.out.println("Колонка (1-3): ");
                int columnin = scanner.nextInt();


                // проверить ввод пользователя на корректность 1 - что символ из диапазона 1-3
                inputisincorrect = ((linein == 1 || linein == 2 || linein == 3) && (columnin == 1 || columnin == 2 || columnin == 3)) ? false : true;
                if (inputisincorrect) {
                    System.out.println("Ввод некорректен, игрок " + gamernumber + " попробуйте ещё раз.");
                }

            } while (inputisincorrect);


            // Занести ввод пользователя в игровую таблицу

            tab[linein - 1][columnin - 1] = 'x';
            System.out.println("Checkpoint 1");


//проверить выигрышную позицию
            gameoverCheck(tab);
            if (gameover) {
                System.out.println("Игра окончена. Победил игрок " + gamernumber);
                break;
            }

            // сменить игрока 1 на 2 или 2 на 1 через тернарное выражение
        } while (true);
    }

    void gameoverCheck(char[][] tab) {
        for (int i = 0; i < 3; i++) {
            if ((tab[i][0] = tab[i][1] = tab[i][2]) != '.')
            //||  (tab[0][i] = tab[1][i] = tab[2][i] != '.'))
            {
                gameover = true;
                break;
            }
            if ((tab[0][0] = tab[1][1] = tab[2][2]) != '.')
            //||  (tab[2][0] = tab[1][] = tab[0][2] != '.'))
            {
                gameover = true;
                break;
            }
        }
    }
}