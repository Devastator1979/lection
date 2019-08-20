//Equals (рефлексия, Симетрия, транзитивность, консистенция). инициализаторы.
//Instanceof-пример необходимо 2 параметра для сравнения, всегда у инстансоф находится ссылка на объект который мы собираемся проверить
//с права указывается имя типа(класса) который мы собираемся проверять.
// тип объекта слева является наследником от того типа который указан справа.
//Хэшкод для нас генерирует целочисленное значение типа инт 
package lection19;
class Parent{
    
}
class Child extends Parent{
    
}
class Child2 extends Parent{
     
}

public class Task01 {
    public static void main(String arg[]){
        Parent p = new Parent();
        if (p instanceof Parent){
            System.out.println("true");
        }
        Child c = new Child();
        if (c instanceof Child){
            System.out.println("true");
        }
        //Обратить внимание что сравниваться будет объект Child
        Parent p2 = new Child();
        if (p2 instanceof Parent){
            System.out.println("true");
        }
        Parent p3 = new Parent();
        if (p3 instanceof Parent){
            System.out.println("true");
        }
        Parent p4 = new Child2();
        if (p4 instanceof Parent){
            System.out.println("true");
        }
        Child2 c3 = new Child2();
        if (c3 instanceof Parent){
            System.out.println("true");
        }
        Parent pc = new Child();
        if(pc instanceof Child){
        Child c4 = (Child)pc;
        System.out.println(c4);
        }
    }
}
