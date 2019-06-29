package lection10;
public class Task03 {
    public static void main(String arg[]){
        
        Integer i = Integer.valueOf("42");
        int b = i+1;
        i = new Integer (b);
        System.out.println(i);
        
        // unrepak автораспаковка
        Integer y = Integer.valueOf("567");
        Integer x = y;
        //repak автоупаковка
        y++;
        System.out.println(x == y);
        System.out.println(y);
        
        Integer i1 =10;
        Integer i2 =10;
        // Механизм оптимизации применяется для классов оберток типа byte
        // механизм оптимизации применяется для классов оберток типа boolean
        // short и integer в диапазоне от -128 до 127
        Integer i3 =1000;
        Integer i4 =1000;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        
        Boolean b1 =true;
        Boolean b2 =true;
        // Механизм оптимизации применяется для классов оберток типа byte
        // механизм оптимизации применяется для классов оберток типа boolean
        // short и integer в диапазоне от -128 до 127
        Integer i5 = new Integer (10);
        Integer i6 = new Integer (10);
        System.out.println(b1 == b2);
        System.out.println(i5 == i6);
    }
}
