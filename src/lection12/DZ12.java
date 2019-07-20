//Написать программу на вход которой подается слово латинецей а она выдает последовательность
// и колличество нажатий для вывода слова на клавиатуре старого телефона

//Написать программу которая распознает слова поллиндромы
//Написать программу которая разпознает фразы поллиндромы без учета регистра, пробелов
// и знаков пунктуации

// Посчитать колво зяпятых в строке 2 способами CharAt  и indexof
// Посчитать в строке колво слов в тексте без использования готовых методов
package lection12;
import java.*;

public class DZ12 {
    public static void main(String arg[]){
        boolean a;
        a = isPalindrome("лывалдывдлаывлдадлывалдо");
        if (a == true){
            System.out.println("Строка или слово является полиндромом");
        }
        else{
            System.out.println("Строка или слово НЕ является полиндромом");
        }
    }
    
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W","");//удаляем все ненужное
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse(); //переворачиваем строку
        String invertedText = strBuilder.toString();//присваиваем перевернутую строку

        return text.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра

    }
}
