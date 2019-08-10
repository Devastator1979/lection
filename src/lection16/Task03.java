//модификаторы доступа "Пакеты"
//Аспект2 работает только при наследуюмом классе
package lection16;
class Zoo1{
    public String coolMethod1(){
        return "Wow baby";
    }
}
class Moo1 extends Zoo1{
    public void useAZoo(){
        System.out.println("A zoo says, " + coolMethod1());
    }
}
public class Task03 {
    public static void main(String arg[]){
        Moo moo1 = new Moo();
        moo1.useAZoo();
    }
}


