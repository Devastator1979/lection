package lection.U09;
import java.util.*;
class point{
    int x;
    int y;
}
public class Task02 {
    public static void main (String args[]){
        point p[];
        p = new point[10];
        for (int i=0;i<p.length;i++){
            p[i] = new point();
            p[i].x = (int)(Math.random()*10)+1;
            p[i].y = (int)(Math.random()*10)+1;
        }
        for (int i =0; i<p.length; i++){
            System.out.println("x = " + p[i].x + " y = " + p[i].y);
        }
    }
}
