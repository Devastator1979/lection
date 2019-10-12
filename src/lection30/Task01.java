//Статические классы не являются вложеным классом но внутренним не является.
//
package lection30;
class Outer{
    static class InnerStatic{
        void foo(){
            System.out.println("Method call!!");
        }
    }
    static void newInner(){
        //Первая ситуациия
        InnerStatic in = new InnerStatic();
        in.foo();
}
}

public class Task01 {
    public static void main(String args[]){
        Outer.newInner();
        // вторая ситуация
        Outer.InnerStatic o1 = new Outer.InnerStatic();
        o1.foo();
    }
}
