package com.teachmeskills.hw.lesson_20.task2.service;

import java.util.LinkedList;
import java.util.Queue;

import static com.teachmeskills.hw.lesson_20.task2.constant.Constants.MAX_CARS_AMOUNT;

public class ServiceStation {
    private final Queue<String> carsQueue = new LinkedList<>();

    public synchronized void addCar(String car) throws InterruptedException {
        while (carsQueue.size() >= MAX_CARS_AMOUNT) {
            System.out.println("Car Service is full. Car " + car + " is waiting.");
            wait();
        }
        carsQueue.add(car);
        System.out.println("Car " + car + " added for service.");
        notifyAll();
    }

    public synchronized void removeCar() throws InterruptedException {
        while (carsQueue.isEmpty()) {
            System.out.println("Car Service is available.");
            wait();
        }
        String car = carsQueue.poll();
        System.out.println("Car " + car + " taken after service.");
        notifyAll();
    }
}
