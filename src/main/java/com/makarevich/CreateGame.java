package com.makarevich;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public  class CreateGame {

    private int randomValue = new Random().nextInt(100);

    private List<CompareGame> handlers = new ArrayList<>();

    public CreateGame() {
        System.out.println(randomValue);
        handlers.add(new NeedNumber(randomValue));
        handlers.add(new BigestNumber());
        handlers.add(new LowNumber());
        handlers.add(new LowThenNeed(randomValue));
        handlers.add(new BiggerThanNeed(randomValue));
    }

    public void processValue(Integer input) {
        for(CompareGame handler : handlers) {
            if (handler.compareData(input)) {
                break;
            }
        }
    }
}
