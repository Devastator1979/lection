//Итератор
package lection31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Dog1{
    String name;
    Dog1(String name){
    this.name = name;
}
}
public class Task06 {
    public static void main(String [] args){
        List<Dog1> d = new ArrayList<>();
        Dog1 dog = new Dog1("aiko");
        d.add(dog);
        d.add(new Dog1("clover"));
        d.add(new Dog1("magnolia"));
        Iterator<Dog1> i3 = d.iterator();
        while (i3.hasNext()){
            Dog1 d2 = i3.next();
            System.out.println(d2.name);
        }
        for(Dog1 x : d )
            System.out.println(x.name);
    }
}
