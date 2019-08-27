package lection21;
class Point{
    int x;
    int y;
    Point (int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Task02 {
    static void test(Point p){
        p = new Point (100, 100);
    }
    public static void main(String arg []){
        //Передача примитивных типов - по значению (передается копия)
        //Передача объектов - по ссылке (работаем с темже объектом изменения сделанные с объектом сохраняются)
        //передача значения ссылочных переменных - по значению
        Point p = new Point (3, 7);
        test (p);
        System.out.println(p.x + " " + p.y);
    }
}
