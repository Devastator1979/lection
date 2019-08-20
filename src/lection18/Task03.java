//Запрещены преобразование от примитивных типов к ссылочным
//Запрещены любые преобразования от булевского типа к другому и наоборот

//Класс Object
//Object- папа всех классов родитель всех классов
/* boolean equals (Object obj)- метод сравнение объектов по состоянию
void finalize() - 
int hashCode() - генерирует специальное целочисленное значение которое носит название хэшкод
final void notify() - 
final void notifyAll - 
final void wait() - для многопоточности
String toString () - метод отвечающий за преобразование объекта к строке
*/
//Метод equals  должен подчинятся закону рефлексии - если метод вызывается для одного и тогоже объекта должен возвращать true
//Следующий метод симетрия - при изменение порядка сравнения объектов должен быть одинаковый результат.
//Свойство транзитивности. Если сравниваем 3 объекта то они все должны выдавать при сравнении одинаковый результат.
//Консистенция - в любой точке для двух объектов которые не меняли своих состояний метод equals  должен отрабатывать одинаково.
//Если передается значение null методу equals должен вернуть false.
package lection18;
class Point{
    int x;
    int y;
    Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    /*@Override
    public String toString(){
        return "x = " + x + "; y = " + y;
    }*/
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
public class Task03 {
    public static void main(String arg []){
        Point p1 = new Point(3,5);
        System.out.println(p1);
        Point p2 = new Point(3,5);
        System.out.println(p1.equals(p2));
    }
}