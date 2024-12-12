package com.teachmeskills.hw.lesson_20.task2;

import com.teachmeskills.hw.lesson_20.task2.service.AddCarThread;
import com.teachmeskills.hw.lesson_20.task2.service.RemoveCarThread;
import com.teachmeskills.hw.lesson_20.task2.service.ServiceStation;

public class Task2 {

    public static void runThreads(){
        ServiceStation station = new ServiceStation();

        Thread addCarThread = new AddCarThread(station);
        Thread removeCarThread = new RemoveCarThread(station);

        addCarThread.start();
        removeCarThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        addCarThread.interrupt();
        removeCarThread.interrupt();
        System.out.println("Weekends! See you on Monday!");
    }

}
