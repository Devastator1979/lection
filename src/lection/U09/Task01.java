// Двухмерный массив с таблицей умножения
package lection.U09;

public class Task01 {

    public static void main(String[] args) {
        //Объявляем массив
        int[][] array = new int[10][10];
        //Цикл прохода по строкам
        for (int i = 0; i < array.length; i++) {
            //Проход по столбцам
            for (int j = 0; j < array[i].length; j++) {
                //Записываем значение в элемент массива
                array [i][j] = (i+1) * (j+1);
                //выводим текущий эллемент массива
                System.out.print(array[i][j] + "\t");
            }
            //Переход на следующую строку
            System.out.println();
        }
    }
}
