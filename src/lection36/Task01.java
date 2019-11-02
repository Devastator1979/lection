package lection36;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Task;

class Barrel{
    int volume = 0;
    String state = "Empty";
     void stateVolume(int i) {
         if(i>0){
             try {
                 volume = i;
                 sleep(100);
                 state = "Full";
                 System.out.println("Barrel is " + state + " qyantity " + i);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Barrel.class.getName()).log(Level.SEVERE, null, ex);
             }
         }else
         {
              volume = 0;
              state = "Empty";
              System.out.println("Barrel is " + state + " qyantity " + volume);
         }
     }
     class RunBarrels implements Runnable{
         public void run(){
             //Barrel b = new Barrel();
            for (int i=0;i<100;i++){
                if (i%2>0){
                    stateVolume(i);
                }
                else
                {
                    stateVolume(0);
                }
                //read();
                //System.out.println("Итерация read "+ i);
            }
        }
     }
}

public class Task01 {
    public static void main(String args[]){
        Barrel b = new Barrel();
        Barrel.RunBarrels rb1 = b.new RunBarrels(); 
        Thread p1 = new Thread(rb1);
        Thread p2 = new Thread(rb1);
        p1.start();
        p2.start();
    }
}
