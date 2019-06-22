package lection.U09;

public class Task03 {

    public static void main(String args[]) {
        int[][] array = new int[3][];
        array[0] = new int[3];
        array[0][0] = 5;
        array[0][1] = 8;
        array[0][2] = 1;
        array[1] = new int[2];
        array[1][0] = 3;
        array[1][1] = 8;
        array[2] = new int[1];
        array[2][0] = 2;
        array[0][1] = -8;
        array[1][1] = -8;
        for (int i = 0; i < array.length; i++) {
            //Проход по столбцам
            for (int j = 0; j < array[i].length; j++) {
                //выводим текущий эллемент массива
                System.out.print(array[i][j] + "\t");
            }
            //Переход на следующую строку
            System.out.println();
        }
    }
}
