package lection11;
public class Task02 {
    public static void main(String arg[]){
        
    }
}
//Модификаторы
//-Доступа(private, protected,public)
//-final
//-transient и volatile.
// тип
// имя
// Инициализация
class t {
    public static int a = 42;
    double d;
    
 
}
//Модификаторы для метода
//-доступа (private,protected,public)
//-final
//-nativ и synchronized
//тип возвращаемого значения или void
//имя метода
//список аргументов
//throw-выражение
class Point{
    int x;
    int y;
    Point (int x, int y){
        this.x = x;
        this.y = y;
    }
}
class test {
    Point createPositivePoint(int x, int y){
    return (x>0 && y>0) ? new Point(x, y):null;
}
}