package lection33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BinSearch{
    Integer name;
    BinSearch(Integer name){
    this.name = name;
    }
}
public class Task02 {
    public static void main(String args []){
        List<Integer> se = new ArrayList<>();
        se.add(300);
        se.add(259);
        se.add(86);
        se.add(889);
        se.add(1387);
        se.add(2);
        System.out.println(se);
        Collections.sort(se);
        
        System.out.println(Collections.binarySearch(se, 86));
        System.out.println(se);
    }
}
