package lection17;
//Заканчивалась игра по окончанию слова
//Поздравление с окончанием игры с указанием колличества попыток
//Защита от дурака при вводе без пробелов и только по одному символу либо слово целиком
//переменная для накопления что ввыводить в консоль через string buffer

import java.util.*;

public class Task04 {

    public static void main(String arg[]) {
        String word = "supermen";
        boolean[] mask = new boolean[word.length()];
        for (boolean b : mask) {
            b = false;
        }
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите букву или слово");
            String temp = sc.nextLine();
            char ch = temp.charAt(0);

            for (int i = 0; i < word.length(); i++) {
                if (ch == word.charAt(i)) {
                    mask[i] = true;
                }
            }

            System.out.println();

            for (int i = 0; i < mask.length; i++) {
                if (mask[i] == true) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print("*");
                }
            }
        }
    }
}
