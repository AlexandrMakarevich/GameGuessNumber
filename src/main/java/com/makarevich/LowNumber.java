package com.makarevich;

public class LowNumber implements CompareGame {

    private int lowNumber = 0;

    @Override
    public boolean compareData(Integer inputNumber) {
        if (inputNumber < lowNumber) {
            System.out.println("�� ����� ����� ������ " + lowNumber);
            return true;
        }
        return false;
    }
}
