/*Статические поля и методы*/
package lection14;
class Frog{
    static int count = 0;
    static int x;
    static int y;
    
    Frog(){
       count++;
    }
    static void seyQa(){
        System.out.println("Kvaaaaaa");
    }
    static void setCoordinates(int x_, int y_){
        x =x_;
        y = y_;
    }
}
public class Task03 {
    public static void main(String arg[]){
        /*new Frog();
        new Frog();
        new Frog();
        new Frog();
        Frog fr3 = new Frog();
        new Frog();
        new Frog();*/
        System.out.println("Frog initions = " + Frog.count);
        Frog.seyQa();
        Frog.setCoordinates(10, 20);
        System.out.println(Frog.x + " " + Frog.y);
    }
}
