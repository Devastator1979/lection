package lection.U08;
import java.util.*;
public class Task03 {
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] Arr = Task02.createMas(4, 4);
        float [][] Arrfl = Task02.createMas();
        Task02.fillRandom(Arr);
        Task02.fillRandom(Arrfl);
        print();
    	print(2);
    	print("2");
        print(Arr);
        print(Arrfl);
    }

    static void print()
    {
        System.out.println("empty");
    }
    
    // метод имеет такое же имя, но один формальный параметр
    static void print(int i)
    {
        System.out.println("int value " + i);
    }

    // метод имеет такое же имя, один формальный параметр, но другого типа
    static void print(String s)
    {
        System.out.println("string " + s);
    }

    // static int print(String s)
    {
        // System.out.println("string " + s);
    }

    static void print(int[][] mas)
    {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");            
            }
        System.out.println();
        }
    }
    public static void print(float[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");            
            }
        System.out.println();
        }
    }
    // FIXME Дописать перегруженный метод для вывода массива строк не используя
    // класс Arrays. Дописать методы для вывода на консоль, двухмерных массивов
    // с различными типами данных (float, boolean, char).
    }
    


