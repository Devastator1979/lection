//Базовые принципы ООП
//Инкапсуляция - доступ ко всем полям класса необходимо закрывать, вплоть до применения
// private. Для того чтобы работать с полями необходимо применять методы. Для работы с закрытыми полями применяем методы.
//Гетеры "get" и сетеры "set".
//Композиция(composition) - принцип который основан на связи has-a
//Делегирование(delegation) - 
//Наследование(inheritance) - 
package lection20;
class Point{
    int x;
    int y;
    Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "x = " + x + "; y = " + y;
    }
    @Override
    public boolean equals(Object o){
        if ((o instanceof Point)&&(this.x == ((Point)o).x)
                && (this.y == ((Point)o).y))
            return true;
        
        else {
            return false;
        }
        
    }
    @Override
    public int hashCode(){
        return x + y;
    }
}
public class Task01 {
    public static void main(String arg []){
        Point p1 = new Point(3,5);
        System.out.println(p1);
        Point p2 = new Point(3,5);
        System.out.println(p1.equals(p2));
    }
}