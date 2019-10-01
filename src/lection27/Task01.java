//Скрывающие объявления элементов класса
//
package lection27;
class Parent{
    //static int a =0;
    static int foo(){
        return 0;
    }
}
class Child extends Parent{
    //static int a = 1;
    static int foo(){
        return 1;
    }
}
public class Task01 {
    public static void main(String args []){
        Child c = new Child();
        Parent p = c;
        System.out.println(c.foo());
        System.out.println(p.foo());
    }
}
