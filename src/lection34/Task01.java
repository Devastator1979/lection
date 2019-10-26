package lection34;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;


class My1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            //try {
                //int a = ((int)(Math.random()*20)+5)*1000;
                //sleep(a);
                //Thread.yield();
                
            //} catch (InterruptedException ex) {
            //    Logger.getLogger(My1.class.getName()).log(Level.SEVERE, null, ex);
            //}
        System.out.println("Выполняется - " + Thread.currentThread().getName() + " "+(i+1));
        
        }
    }
}


public class Task01 {
    public static void main(String args[]){
        My1 r = new My1();
        Thread t = new Thread(r);
        t.setName("Potok1");
        t.setPriority(4);
        My1 r1 = new My1();
        Thread t1 = new Thread(r1);
        t1.setName("Potok2");
        t1.setPriority(10);
        My1 r2 = new My1();
        Thread t2 = new Thread(r2);
        t2.setName("Potok3");
        t2.setPriority(1);
        My1 r3 = new My1();
        Thread t3 = new Thread(r3);
        t3.setName("Potok4");
        t3.setPriority(3);
        t.start();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Thread main    " + Thread.currentThread().getName());
    }
}
