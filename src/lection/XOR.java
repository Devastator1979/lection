//Логический оперптор ^ как поменять местами 2 переменный не вводя 3 переменную
package lection;
public class XOR {
    public static void main(String[] args) {
                
        int a = 5;
        int b =10;
        a = a^b;
        System.out.println(a);
        b = b^a;
        System.out.println(b);
        a = a^b;
        System.out.println(a);
    }

}
