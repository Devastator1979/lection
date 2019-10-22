//public static void sleep(long millis) throws InterruptedException
//public static void yield()
//public final void join() throws InterruptedExceptions
//public final void setPriority(int newPriority)



//public final void wait() throws InterruptedException
//public final void notify()
//public final void notifyAll()
package lection33;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<6; i++){
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("Готовит хавку - " + Thread.currentThread().getName() + " "+(i+1));
        
        }
    }
}
class MyRunnable1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<6; i++){
        System.out.println("Моет пол - " + Thread.currentThread().getName() +" "+ (i+1));
        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<6; i++){
        System.out.println("Бухает колу - " + Thread.currentThread().getName() +" "+ (i+1));
        }
    }
}
public class Task04 {
    public static void main(String args[]){
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.setName("Tania");
        MyRunnable1 r1 = new MyRunnable1();
        Thread t1 = new Thread(r1);
        t1.setName("Ricky");
        MyRunnable2 r2 = new MyRunnable2();
        Thread t2 = new Thread(r2);
        t2.setName("Martin");
        t.start();
        t1.start();
        t2.start();
        System.out.println("Thread main    " + Thread.currentThread().getName());
  
    }
}
