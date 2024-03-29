//Создание конструктора для класса
//Имя конструктора всегда идентично имени класса
    //1. У конструктора нет возвращаемых значений в отличии от метода
    //2. Конструкторы как методы не могут быть вызваны в ручную, они запускаются
    // атоматически
    
    // Коструктору как и методу можно передавать входные параметры
    // Как и у метода есть тело конструктора
    //Точка запуска конструктора автоматически когда создаем объект на базе класса
    // комманда new
    // Нет классов без конструкторов
    //Всегда в момент создания объекта отработает какой-либо конструктор
    //Конструкторы применяются для инициализации объектов
    //Как и методы конструкторы могут быть перегружеными
    //Если в классе не создан явным образом ни один конструктор, то создается
    //так называемый конструктор по умолчанию "дефолтный конструктор" конструктор
    //с пустыми круглыми скобками.
    //Объявленный явно конструктор с пустыми круглыми скобками будет называться
    // конструктор без аргументов
package lection12;
class Point{
    int x;
    int y;
    Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    Point (){
        x = 0;
        y = 0;
    }
}
public class Task03 {
    public static void main(String arg[]){
        Point p1 = new Point(5,8);
        System.out.println("X= " + p1.x + " Y= " + p1.y);
        Point p2 = new Point(10,12);
        System.out.println("X= " + p2.x + " Y= " + p2.y);
        Point p3 = new Point();
        System.out.println("X= " + p3.x + " Y= " + p3.y);
    }
}
