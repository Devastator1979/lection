//Колекции
//ArrayList
package lection30;

import java.util.*;

public class Task02 {
    public static void main(String arg[]){
        List <String> test = new ArrayList<>();
        String s = "hi";
        test.add("stirng");
        test.add(s);
        test.add(s+s);
        System.out.println(test.size());
        System.out.println(test.contains(42));
        System.out.println(test.contains("hihi"));
        test.remove("hi");
        System.out.println(test.size());
        for(int i=0;i<test.size();i++){
            System.out.println(test.get(i));
        }
        for(String str:test){
            System.out.println(str);
        }
        System.out.println(test);
    }
}
