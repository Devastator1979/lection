//Взаимодействие потоков
package lection36;

//import static java.lang.Thread.sleep;
//import java.util.logging.Level;
//import java.util.logging.Logger;

class ThreadB extends Thread{
    int total;
    public void run(){
        synchronized(this){
            for (int i =0; i<1; i++){
                total += i;
            }
            notify();
        }
    }
}

public class Task02 {
    
    ThreadB b = new ThreadB();
    class Runables implements Runnable{
    public void run(){

        synchronized(b){
            try {
                System.out.println("Waiting for b to complete...");
                b.wait();
            }
            catch(InterruptedException e){
                
            }
            System.out.println("Total is: " + b.total);
        }
    }
}
    public static void main(String args[]){
        Task02 t1 = new Task02();
        Task02.Runables r1 = t1.new Runables();
        Thread p1 = new Thread(r1);
        Thread p2 = new Thread(r1);
        Thread p3 = new Thread(r1);
        p1.start();
        p2.start();
        p3.start();
    }
}
