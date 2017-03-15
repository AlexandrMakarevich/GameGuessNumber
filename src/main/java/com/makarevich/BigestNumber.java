package com.makarevich;

public class BigestNumber implements CompareGame {

    private int bigestNumber = 100;

    @Override
    public boolean compareData(Integer inputNumber) {
        if (inputNumber > bigestNumber) {
            System.out.println("Вы ввели число больше " + bigestNumber);
            return true;
        }
        return false;
    }
}
