package lection31;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task04 {
    public static void main(String [] args){
        boolean[] ba =new boolean[5];
        Set <String> s = new HashSet <> ();
        ba[0] = s.add("Беларусь");
        ba[1] = s.add("Россия");
        ba[2] = s.add("Украина");
        ba[3] = s.add("Польша");
        ba[4] = s.add("Германия");
        for(int x = 0; x<ba.length;x++)
            System.out.print(ba[x] + " ");
        System.out.println("\n");
        for(Object o:s)
            System.out.print(o+" ");
        System.out.println("\n");
        
        boolean[] bb =new boolean[5];
        Set <String> l = new LinkedHashSet <> ();
        ba[0] = l.add("Беларусь");
        ba[1] = l.add("Россия");
        ba[2] = l.add("Украина");
        ba[3] = l.add("Польша");
        ba[4] = l.add("Германия");
        for(int x = 0; x<bb.length;x++)
            System.out.print(bb[x] + " ");
        System.out.println("\n");
        for(Object o:l)
            System.out.print(o+" ");
        System.out.println("\n");
        
        boolean[] bc =new boolean[5];
        Set <String> t = new TreeSet <> ();
        ba[0] = t.add("Беларусь");
        ba[1] = t.add("Россия");
        ba[2] = t.add("Украина");
        ba[3] = t.add("Польша");
        ba[4] = t.add("Германия");
        for(int x = 0; x<bc.length;x++)
            System.out.print(bc[x] + " ");
        System.out.println("\n");
        for(Object o:t)
            System.out.print(o+" ");
    }
}
