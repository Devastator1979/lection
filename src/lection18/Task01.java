//Преобразование типов. Ссылочный тип.
//Операции на сужение и расшириении ссылочных типов завязаны на иерархии классов
//Набор полей который доступен через переменную определяется типом переменной которая используется для доступа.
package lection18;
class Parent{
    int x = 42;
      int Mp(){
        int q = 100;
        return q;
    }
}
class Child extends Parent{
    int y = 10;
}
class Child2 extends Parent{
    int z = 0;
}
public class Task01 {
    public static void main(String arg []){
        //Parent p = new Parent();
        Parent p = new Child2();
        //System.out.println(p.Mp());
        
        //Child c = new Child();
        //System.out.println(c.x);
        //System.out.println(c.y);
        
        //Parent p2 = new Child();
        //System.out.println(p2.x);
        Child c = (Child)p;
        System.out.println(c.y);
        //System.out.println(c1.y);
    }
}