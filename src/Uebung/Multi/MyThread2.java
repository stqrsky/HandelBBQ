package Uebung.Multi;

public class MyThread2 extends Thread {
    private int x =0;

    public MyThread2(String name) {
        super(name);
    }

    public void run(){
        synchronized (this.getClass()){
            int a = 0;
            while (a <= 50){
                System.out.println(this.getName()+ " = "+ x++);
                a++;
            }

        }
    }
}


