//первый пример полиморфизма ВЫУЧИТЬ НА ИЗУТЬ
//необходима иерархия объектов
//переопределяем общий метод
// вызов переопределенного метода через переменную родительского типа
package lection22;
class Point5{
    void draw(){
    System.out.println("Point");
    }
}
class Line extends Point5{
    @Override
    void draw(){
    System.out.println("Line");
    }
}
class Circle extends Point5{
    @Override
    void draw(){
    System.out.println("Circle");
    }
}
public class Task03 {
    public static void main(String arg[]){
        Point5[] p = new Point5[1000];
        p[0] = new Line();
        p[1] = new Circle();
        
        for(int i = 0; i<p.length; i++){
            if(p[i]!=null) 
                p[i].draw();
        }
    }
}
