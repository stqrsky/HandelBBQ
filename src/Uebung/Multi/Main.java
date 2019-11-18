package Uebung.Multi;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread2 t1 = new MyThread2("A");
        MyThread2 t2 = new MyThread2("B");
        t1.start();
        t2.start();
        Thread.sleep(10);
        t1.interrupt();
        t2.interrupt();
        /*
        MyThread t3 = new MyThread("C");
        MyThread t4 = new MyThread("D");
        MyThread t5 = new MyThread("E");
        MyThread t6 = new MyThread("F");
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t3.interrupt();
        */
       MyThread mt = new MyThread("A");
       Thread t = new Thread(mt);
       t.start();
       Thread.sleep(5);
       t.interrupt();
    }
}
