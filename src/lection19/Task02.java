// Finale
//Константа должна быть проинициализирована в каждом конструкторе в котором есть вызов super()
//константу где используетсф метод this() инициализировать нельзя.
//Если константа объектного типа - должна быыть проиницилизирована только в одном инициализаторе.
package lection19;

final class TestConst{
    final int i;
    //Инициализатор
    {
        i = 100;
    }
    TestConst(){
        //i = 42;
    }
    TestConst( int temp){
        //i = 10;
    }
    TestConst(String a1, String a2){
        this();
        //i = 10;
    }
}
public class Task02 {
    public static void main(String arg []){
        
    }
}
