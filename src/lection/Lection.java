//Примеры использования
package lection;

public class Lection {

    public static void main(String[] args) {
        // Пример использования For
        for (int i = 0, b = 3; i < 10 || b < 8; i++, b += 2) {
            System.out.println("i =: " + i + "; b =: " + b);
        }
        //Пример использования while
        int a = 1;

        while (a <= 10) {
            System.out.println(a++);
        }
        //Пример использования do while
        do {
            System.out.println(a++);
        }
        while (a >= 2 && a <= 10);
        }

    }
