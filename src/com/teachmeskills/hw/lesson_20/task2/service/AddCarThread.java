package com.teachmeskills.hw.lesson_20.task2.service;

public class AddCarThread extends Thread{
    private final ServiceStation station;

    public AddCarThread(ServiceStation station) {
        this.station = station;
    }

    @Override
    public void run() {
        int carNumber = 1;
        try {
            while (!Thread.currentThread().isInterrupted()) {
                String car = "Car-" + carNumber++;
                station.addCar(car);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
