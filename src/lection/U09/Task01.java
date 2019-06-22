package lection.U09;

public class Task01 {

    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = (i+1) * (j+1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
