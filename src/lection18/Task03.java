//Запрещены преобразование от примитивных типов к ссылочным
//Запрещены любые преобразования от булевского типа к другому и наоборот

//Класс Object
//Object- папа всех классовб родитель всех классов
/* boolean equals (Object obj)- метод сравнение объектов по состоянию
void finalize() - 
int hashCode() - генерирует специальное целочисленное значение которое носит название хэшкод
final void notify() - 
final void notifyAll - 
final void wait() - для многопоточности
String toString () - метод отвечающий за преобразование объекта к строке
*/
package lection18;
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
    
}
public class Task03 {
    public static void main(String arg []){
        Point p1 = new Point(3,5);
        System.out.println(p1);
        Point p2 = new Point(3,5);
        System.out.println(p1.equals(p2));
    }
}