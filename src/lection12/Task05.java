//У каждого конструктора в первой строке есть вызов метода super()
// Снвчала отрабатывают конструкторы родительских классов потом наследников
package lection12;
class Parrent{
    int x = 12;
    Parrent(){
        System.out.println("Parrent constructor");
    }
}
class Child extends Parrent{
    int y = 3;
    Child (int x, int y){
        System.out.println("Chaild constructor");
        this.x=x;
        this.y=y;
    }
    Child (){
        System.out.println("Chaild constructor");
    }
}
class OfCild extends Child{
    OfCild(){
        System.out.println("OfCild construcror");
    }
}
public class Task05 {
    public static void main(String arg[]){
        OfCild c1 = new OfCild();
        //Child c = new Child(100,500);
        //System.out.println("Parrent x= "+ c.x + " Child y= " + c.y);
        
    }
    
}
