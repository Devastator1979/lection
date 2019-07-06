package lection11;
public class Task04 {
    public static void main(String arg[]){
        int x = 67;
        int y = 78;
        String  binStrX = Integer.toBinaryString(x);
        String  binStrY = Integer.toBinaryString(y);
        System.out.println(binStrX);
        System.out.println(binStrY);
        System.out.println("Оператор & = "+Integer.toBinaryString(x&y) + " = " + (x&y));
        System.out.println("Оператор | = "+Integer.toBinaryString(x|y) + " = " + (x|y));
        System.out.println("Оператор ^ = "+Integer.toBinaryString(x^y) + " = " + (x^y));
        System.out.println("Оператор ~ = "+Integer.toBinaryString(~x) + " = " + (~x));
        System.out.println("Оператор ~ = "+Integer.toBinaryString(~y) + " = " + (~y));
        System.out.println("Оператор >> x = "+Integer.toBinaryString(x>>1) + " = " + (x>>1));
        System.out.println("Оператор >> x = "+Integer.toBinaryString(x>>2) + " = " + (x>>2));
        System.out.println("Оператор >> x = "+Integer.toBinaryString(x>>3) + " = " + (x>>3));
        System.out.println("Оператор >>> x = "+Integer.toBinaryString(x>>>1) + " = " + (x>>>1));
        System.out.println("Оператор << x = "+Integer.toBinaryString(x<<1) + " = " + (x<<1));
        System.out.println("Оператор << x = "+Integer.toBinaryString(x<<2) + " = " + (x<<2));
        System.out.println("Оператор << x = "+Integer.toBinaryString(x<<3) + " = " + (x<<3));
    }
}
