package com.makarevich;

public class LowThenNeed extends BaseNumber implements CompareGame {

    public LowThenNeed (int needNumber) {
        this.needNumber = needNumber;
    }

    @Override
    public boolean compareData(Integer inputNumber) {
        if (inputNumber < needNumber) {
            System.out.println("Вы вели меньшее число");
            return true;
        }
        return false;
    }
}
