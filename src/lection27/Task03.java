//Вложенные класы делятся на 2 большие категории статические и нестаические
//нестатические называеют еще внутренние(inner clas)
//inner class имеют доступ ко всем елементам внешнего класса
//даже может читать и работать с приватными методами и полями.
//
package lection27;
class MyOuter{
    private int x = 7;
    class MyInner{
        public void seeOuter(){
            System.out.println("Outer x is " + x);
            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + MyOuter.this);
        }
    }
    void newMyInner(){
        MyInner m = new MyInner();
        m.seeOuter();
    }
}
public class Task03 {
    public static void main(String arg[]){
        //MyOuter mo = new MyOuter();
        //mo.newMyInner();
        //MyOuter.MyInner i = mo.new MyInner();
        //i.seeOuter();
        MyOuter.MyInner inner = new MyOuter().new MyInner();
        inner.seeOuter();
    }
}
