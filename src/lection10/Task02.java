package lection10;
public class Task02 {
    public static void main(String arg[]){
        Integer i = Integer.parseInt("42");
        System.out.println(i);
        
        Integer i2 = Integer.parseInt("101010", 2);
        System.out.println(i);
        
        Integer wc = 42;
        byte b = wc.byteValue();
        System.out.println(b);
        
        double d = wc.doubleValue();
        System.out.println(d);
        
        float f = wc.floatValue();
        System.out.println(d);
        
        Float wc1 = 42.5f;
        byte b1 = wc1.byteValue();
        System.out.println(b1);
    }
    
}
