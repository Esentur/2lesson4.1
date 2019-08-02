package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Запуск основного потока "+Thread.currentThread().getName());
        for(int i=1;i<6;i++){
            MyThread th1 = new MyThread();
            th1.setName("Второстепенный поток № "+i);
            th1.start();
        }
       /* MyThread th1 = new MyThread();
        th1.setName("Второстепенный поток №1");
        th1.start();
        MyThread th2 = new MyThread();
        th2.setName("Второстепенный поток №2");
        th2.start();
        MyThread th3 = new MyThread();
        th3.setName("Второстепенный поток №3");
        th3.start();
        MyThread th4 = new MyThread();
        th4.setName("Второстепенный поток №4");
        th4.start();
        MyThread th5 = new MyThread();
        th5.setName("Второстепенный поток №5");
        th5.start();*/
        System.out.println("Завершение основного потока "+Thread.currentThread().getName());
    }
}
