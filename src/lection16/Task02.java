//модификаторы доступа "Пакеты"
//Метод доступа по первому аспекту
package lection16;
class Zoo{
    public String coolMethod(){
        return "Wow baby";
    }
}
class Moo{
    public void useAZoo(){
        Zoo z = new Zoo();
        System.out.println("A zoo says, " + z.coolMethod());
    }
}
public class Task02 {
    public static void main(String arg[]){
        Moo moo1 = new Moo();
        moo1.useAZoo();
    }
}
