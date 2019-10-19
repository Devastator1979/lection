package lection32;
import java.util.*;
class ToDos{
    String day;
    ToDos(String d){
        day = d;
    }
    @Override
    public boolean equals(Object o){
        return(((ToDos)o).day).equals(this.day);
    }
    @Override
    public int hashCode(){
        return 9;
    }
}
public class Task02 {
    public static void main(String args[]){
        Map<ToDos, String> m = new HashMap<>();
        ToDos t1 = new ToDos("Monday");
        ToDos t2 = new ToDos("Monday");
        ToDos t3 = new ToDos("Tuesday");
        m.put(t1,"doLaundry");
        m.put(t2,"payBills");
        m.put(t3,"claenAttic");
        System.out.println(m.size());
        System.out.println(m);
    }
}
