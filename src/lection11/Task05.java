/*
 * Положительное целочисленное значение написать метод котррый будет выводить в
 * двоичном коде число.
 */
package lection11;
class Bynary {

    public static void a(int n) {
        String s;
        s = "";
        for (int mask = 1; mask <= n; mask <<= 1) {
            if ((n & mask) > 0) {
                System.out.print(1);
                s = s + "1";
            } else {
                System.out.print(0);
                s = s + "0";
            }
        }
        int stringLength = s.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = s.charAt(i) + result;
        }

        System.out.println();
        System.out.println("Проверка: " + Integer.toBinaryString(n));
        System.out.println("Результат в переменной строка: " + s);
        System.out.println("Перевернутая строка: " + result);
    }

}

public class Task05 {

    public static void main(String[] args) {
        Bynary bin = new Bynary();
        bin.a(255866655);
        
    }
}
