package lection.U09;
public class Task07 {
    public static void main(String arg[]){
        Integer i1 = new Integer (55);
        Integer i2 = new Integer ("42");
        Integer i3 = 78;
        Integer i4 = Integer.valueOf("89");
        Integer i5 = Integer.valueOf("101010",2);
        System.out.println(i5);
        Integer i6 = Integer.valueOf("AB4",16);
        System.out.println(i6);
        
        Integer i7 = Integer.parseInt("42");
        System.out.println(i7);
        Integer i8 = Integer.parseInt("101010",2);
        System.out.println(i8);
    }
}
