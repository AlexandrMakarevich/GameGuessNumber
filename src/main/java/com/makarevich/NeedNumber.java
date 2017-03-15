package com.makarevich;

public class NeedNumber extends BaseNumber implements CompareGame {

    public NeedNumber(int needNumber) {
        this.needNumber = needNumber;
    }

    @Override
    public boolean compareData(Integer inputNumber) {
        if (inputNumber == needNumber) {
            System.out.println("Вы угадали");
            System.exit(0);
            return true;
        }
         return false;
    }
}
