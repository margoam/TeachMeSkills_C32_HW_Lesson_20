package com.teachmeskills.hw.lesson_20.task1;

import com.teachmeskills.hw.lesson_20.task1.morning_action.DrinkCoffeeThread;
import com.teachmeskills.hw.lesson_20.task1.morning_action.HaveBreakfastThread;
import com.teachmeskills.hw.lesson_20.task1.morning_action.ReadNewsThread;

public class Task1 {

    public static void runThreads(){

        Thread newsReadingThread = new ReadNewsThread();
        Thread breakfastThread = new HaveBreakfastThread();
        Thread coffeeThread = new DrinkCoffeeThread();

        newsReadingThread.setName("Read news");
        breakfastThread.setName("Eat breakfast");
        coffeeThread.setName("Drink coffee");

        newsReadingThread.setPriority(Thread.MIN_PRIORITY);
        breakfastThread.setPriority(Thread.NORM_PRIORITY);
        coffeeThread.setPriority(Thread.MAX_PRIORITY);

        newsReadingThread.start();
        breakfastThread.start();
        coffeeThread.start();
    }
}
