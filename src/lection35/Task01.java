//Блок синхронизации

package lection35;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task01 {
    public static void main (String args[]){
        
    }
    public static int getCount(){
        synchronized(Task01.class){
            int count = 10;
           
            return count;
        }
    }
    public static void classMethod(){
        Class cl=null;
        try {
            cl=Class.forName("Task01");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Task01.class.getName()).log(Level.SEVERE, null, ex);
        }
        synchronized(cl){
            //do stuff
        }
    }
}
