package lection11;
public class Task03 {
    public static void main(String arg[]){
        TestIt ti = new TestIt();
        Point1 p = new Point1();
        p.x = 3;
        p.y = 7;
        //Примитивные типы при передаче внутрь метода всегда передаются как копия
        // Ссылочные типы передаются в метод без копии и могут изменятся значения
        // После их выполнения внутри метода
        //int x = 7;
        ti.foo(p);
        //System.out.println(x);
        System.out.println("Point: x = " + p.x + " y = " + p.y);
        
    }
}
class Point1{
    int x;
    int y;
}
class TestIt{
    void foo(Point1 p){
        //int y = 10;
        //x++;
        System.out.println("Point: x = " + p.x + " y = " + p.y);
        //System.out.println(y);
        p.x *= 2;
        p.y *= 2;
    }
    void boo(){
       // System.out.println(y);
    }
}
