//Интерфейсы.
//Абстрактный класс - на его базе нельзя создавать объекты, но в нем можно создавать методы,
// поля. На базе абстрактного класса можно создавать обычные и абстрактные классы.
//Абстрактные методы не имеют тела.
//Все методы интерфейса абстрактные.На поля в интерфейсах вводятся ограничения.
//Все поля интерфейса public static finale.
//Сами интерфейсы могут быть наследниками от другого интерфейса.
package lection23;
abstract class Myclass{
   void lour(){ 
   }
   int i = 42;
   abstract void foo();
}
interface Movable{
    int up =1;
    int down = 2;
    int left = 3;
    int right = 4;
}
interface Lamp{
    void on();
    void off();
    boolean getState();
    
}
interface ColorLamp extends Lamp{
    int getColor();
}
class CommonLamp implements Lamp{
    boolean state;
    @Override
    public void on(){
        state = true;
    }
    @Override
    public void off(){
        state = false;
    }
    @Override
    public boolean getState(){
        return state;
    }
}
class ChinaLamp implements ColorLamp{
    int fire = 0;
    int color = 255;
    boolean state;
    @Override
    public void on(){
        fire = 1;
    }
    @Override
    public void off(){
        fire = 0;
    }
    @Override
    public boolean getState(){
        return fire > 0;
    }
    @Override
    public int getColor(){
        return color;
    }
    void increaseFire(){
        fire++;
    }
}
interface DiodLamp{
    
}
interface ColorLamp1 extends Lamp, DiodLamp{
   int getColor();
}
public class Task01 {
    public static void main(String arg[]){
        //new Myclass() ;
        Lamp cp = new CommonLamp();
        cp.on();
        System.out.println(cp.getState());
        
        Lamp cl = new ChinaLamp();
        cl.off();
        //cl.increaseFire();
        System.out.println(cl.getState());
        ColorLamp cl2 = new ChinaLamp();
        cl2.on();
        System.out.println(cl2.getColor());
    }
}
