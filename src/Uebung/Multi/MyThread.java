package Uebung.Multi;

public class MyThread extends A implements Runnable{

    public MyThread(String name) {
        super(name);

    }


    public void run() {
        int i = 0;
        while (i<=50){
//            if(Thread.isInterrupted()) {
//            break;
//            }
            System.out.println("_____"+"\t "+ i++);
            if(Thread.interrupted()) break;

        }
    }
}
