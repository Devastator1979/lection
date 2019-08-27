//Делегирование
package lection20;
class SpaseShipControl{
    void up (int velocity){}
    void down (int velocity){}
    void left (int velocity){}
    void right (int velocity){}
}
class Engine{}
class SpaseShip{
    private SpaseShipControl ssc= new SpaseShipControl();
    private Engine en = new Engine ();
    
    public void up (int velocity){
        ssc.up(velocity);
    }
    public void down (int velocity){
        ssc.down(velocity);    
    }
    public void left (int velocity){
        ssc.left(velocity);
    }
    public void right (int velocity){
        ssc.right(velocity);
    }
}
public class Task05 {
    public static void main(String arg []){
        SpaseShip sp1 = new SpaseShip();
        sp1.up(15);
    }
}
