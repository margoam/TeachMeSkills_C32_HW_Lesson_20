package com.teachmeskills.hw.lesson_20.task2.service;

public class RemoveCarThread extends Thread{

    private final ServiceStation station;

    public RemoveCarThread(ServiceStation station) {
        this.station = station;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                station.removeCar();
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
