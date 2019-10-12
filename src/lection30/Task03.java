package lection30;

import java.util.ArrayList;
class Cat{
    @Override
    public String toString() {
        String o = "  ^^ \n >oo<";
    return o;
    }
}

public class Task03 {
    public static void main(String args[]){
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(7);
        list.add(new Object());
        list.add(new Cat());
        list.add(new int[8]);
        
        for(Object obj: list){
            System.out.println(obj);
        }
    }
}
