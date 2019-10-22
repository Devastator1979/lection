package lection33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ToDos{
    String day;
    ToDos(String day){
        this.day = day;
    }
}
public class Task01 {
    public static void main(String args[]){
        List<ToDos> day = new ArrayList<>();
        day.add(new ToDos("Воскресенье"));
        day.add(new ToDos("Среда"));
        day.add(new ToDos("Пятница"));
        day.add(new ToDos("Суббота"));
        day.add(new ToDos("Понедельник"));
        Iterator<ToDos> i3 = day.iterator();
        while(i3.hasNext()){
            ToDos day1 = i3.next();
            System.out.println(day1.day);
        }
        System.out.println(day.size());
    }
}
