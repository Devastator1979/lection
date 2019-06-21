package lection.U08;
import java.util.*;
public class Task02 {
    public static void main(String[] args) {
        int [][] Arr = createMas(4,4);
        fillRandom(Arr);
        print(meth1(Arr));
        
}
    public static int[][] meth1(int[][]Arr)
    {
        for(int i=0;i<Arr.length;i++){
            for (int j=0; j<Arr.length;j++){
                if ((Arr[i][j])%2==0){
                    Arr[i][j] = -Arr[i][j];
                }
            }
            
        }
        return Arr;
    }
    public static void math2(int[][]Arr)
    {
        
    }
    public static int[][] fillRandom(int[][] mas) {
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rnd.nextInt(100);
            }
        }
        return mas;
    }
    public static float[][] fillRandom(float[][] mas) {
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rnd.nextInt(100);
            }
        }
        return mas;
    }
    public static int[][] createMas(int col, int row) {
        return new int[col][row];
    }
    //перегружаем метод создания масива для float
    public static float[][] createMas() {
        return new float[][]{{1F,2F},{4F,6F}};
    }
    public static void print(int[][] mas) {
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
}
    

