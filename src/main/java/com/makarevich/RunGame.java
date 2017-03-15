package com.makarevich;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunGame {

    public static void main (String[] args) {
        CreateGame createGame  = new CreateGame();
        System.out.println("�������� ����� �� 0 �� 100");
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
           try {
               createGame.processValue(input.nextInt());
           }
           catch (InputMismatchException ex) {
               System.out.println("������������ ���� : " + input.next());
           }
        }
    }
}
