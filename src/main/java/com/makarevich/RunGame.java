package com.makarevich;

import java.util.Scanner;

public class RunGame {

    public static void main (String[] args) {
        int lowNumber = 0;
        int bigestNumber = 100;
        int needNumber = 54;
        int inputNumber;
        System.out.println("�������� ����� �� 0 �� 100");
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            inputNumber = Integer.parseInt(input.next());

            if (inputNumber > bigestNumber) {
                System.out.println("�� ����� ����� ������ " + bigestNumber);
                continue;
            }
            if (inputNumber < lowNumber) {
                System.out.println("�� ����� ����� ������ " + lowNumber);
                continue;
            }
            if (inputNumber == needNumber) {
                System.out.println("�� �������");
                break;
            }
            if (inputNumber > needNumber ) {
                System.out.println("�� ����� ����� ������ ��� �����");
            }
            if (inputNumber < needNumber) {
                System.out.println("�� ����� ����� ������ ��� �����");
            }

        }

    }
}
