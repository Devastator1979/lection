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
                //Загоняем в строку полученую цифру
                s = s + "1";
            } else {
                System.out.print(0);
                //Загоняем в строку полученую цифру
                s = s + "0";
            }
        }
        int stringLength = s.length();
        String result = "";
        //С помощью цикла в обратном порядке переставляем символы строки
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
