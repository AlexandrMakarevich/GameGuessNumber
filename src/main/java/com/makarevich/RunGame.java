package com.makarevich;

import java.util.Scanner;

public class RunGame {

    public static void main (String[] args) {
        int lowNumber = 0;
        int bigestNumber = 100;
        int needNumber = 54;
        int inputNumber;
        System.out.println("Угадайте число от 0 до 100");
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            inputNumber = Integer.parseInt(input.next());

            if (inputNumber > bigestNumber) {
                System.out.println("Вы ввели число больше " + bigestNumber);
                continue;
            }
            if (inputNumber < lowNumber) {
                System.out.println("Вы ввели число меньше " + lowNumber);
                continue;
            }
            if (inputNumber == needNumber) {
                System.out.println("Вы угадали");
                break;
            }
            if (inputNumber > needNumber ) {
                System.out.println("Вы ввели число больше чем нужно");
            }
            if (inputNumber < needNumber) {
                System.out.println("Вы ввели число меньше чем нужно");
            }

        }

    }
}
