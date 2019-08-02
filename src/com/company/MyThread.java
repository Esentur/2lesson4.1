package com.company;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Запуск потока "+this.getName());
        try{
            System.out.println("Останавлиеваем поток "+ this.getName()+" на 1 секунду ");
            sleep(1000);
        }catch (InterruptedException ie){

        }
        System.out.println("Завершение потока "+this.getName());
    }
}
