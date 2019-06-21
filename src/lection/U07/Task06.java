package lection.U07;
import java.util.Random;
public class Task06 {
    public static void main(String[] args) {
        // TODO code application logic here
        int row = 4;
        int col = 4;
        int[][] mas = createIntMas(col, row);
        // FIXME дописать программу - заполнив массив случайными числами и
        // вывести его на консоль используюя существующие методы. Протестировать
        // для массивов разного размера.
        print (fillRandom(mas));
    
    }
   public static int[][] createIntMas(int col, int row) {
        return new int[col][row];
    }
    // FIXME изменить метода таким образом, чтобы верхний предел задаваемых
    // значений можно было бы задавать при использовании метода. Оставить
    // возможность использовать старую сигнатуру.
   public static int[][] fillRandom(int[][] mas) {
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rnd.nextInt(100);
            }
        }
        return mas;
    }
    
    // FIXME дописать код метода, чтобы при его использовании массив выводился
    // на консоль в виде красивой таблички, например:
    // 23 188 31
    //  3   9 22
    //  4  67  0
    
    public static void print(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");            
            }
        System.out.println();
        }
    }
}