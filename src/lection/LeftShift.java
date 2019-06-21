//Побитовый оператор >> сдвиг в право рвносильно делению на 2 отбрасывает дробную часть
package lection;
public class LeftShift {
    public static void main(String[] args) {
        // TODO code application logic here
      
        int i = 100000;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
            i = i >> 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
            i = i >> 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
            i = i >> 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
            i = i >> 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
        i = i >> 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
    }
}
