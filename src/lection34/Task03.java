package lection34;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task03 {
    public static void main (String args[]){
    System.out.println("Main start");
    My1 r = new My1();
    Thread t = new Thread(r);
    t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Task03.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.out.println("Main finish");
    }
}
