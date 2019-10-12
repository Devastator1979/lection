package lection30;

import java.util.ArrayList;
import java.util.Collections;

public class Task04 {
    public static void main(String args[]){
        ArrayList<String> f = new ArrayList();
        f.add("Ananas");
        f.add("Bananas");
        f.add("Apple");
        f.add("Kiwi");
        f.add("Lime");
        Collections.sort(f);
        for(String str: f){
            System.out.println(str);
        }
    }
}
