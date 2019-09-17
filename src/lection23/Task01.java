//Интерфейсы.
//Абстрактный класс - на его базе нельзя создавать объекты, но в нем можно создавать методы,
// поля. На базе абстрактного класса можно создавать обычные и абстрактные классы.
//Абстрактные методы не имеют тела.
//Все методы интерфейса абстрактные.На поля в интерфейсах вводятся ограничения.
//Все поля интерфейса public static finale.
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
public class Task01 {
    public static void main(String arg[]){
        //new Myclass() ;
        CommonLamp cp = new CommonLamp();
        cp.on();
        System.out.println(cp.getState());
    }
}
