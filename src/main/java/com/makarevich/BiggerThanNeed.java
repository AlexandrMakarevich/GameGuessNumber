package com.makarevich;

public class BiggerThanNeed extends BaseNumber implements CompareGame{

    public BiggerThanNeed(int needNumber) {
        this.needNumber = needNumber;
    }

    @Override
    public boolean compareData(Integer inputNumber) {
        if (inputNumber > needNumber) {
            System.out.println("Вы ввели большее число");
            return  true;
        }
        return false;
    }
}
