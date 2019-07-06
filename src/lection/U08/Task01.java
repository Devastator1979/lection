package lection.U08;

import java.util.Arrays;
//import java.util.Random;

public class Task01 {

    // TODO code application logic here
    /**
     * Написать и протестировать методы работы с квадратными матрицами (матрицы
     * представить в виде двухмерных массивов). Должны присутствовать методы: •
     * создания единичной (диагональной) матрицы • создания нулевой матрицы •
     * сложение матриц • умножения матриц • умножение матрицы на скаляр •
     * определение детерминанта матрицы • вывод матрицы на консоль
     */
    /*
     int [][]matrix = new int[][]{{7,1,8,3},{5,6,7,2,9},{8,5,3,8},{1,5,8,1}};
        for (int x=0;x<matrix.length;x++) {
            for (int j = 0; j<matrix.length; j++) {
                System.out.print(matrix[x][j] + " ");
            }
            System.out.println();
    
    public static int number ()
    {
    Scanner s=new Scanner (System.in);
    System.out.print("Input a number: ");
    int y=s.nextInt();
    return y;
    } 
     */
    public static void mas() {
        int[][] matrix = new int[][]{{7, 1, 8, 3}, {5, 6, 7, 2, 9}, {8, 5, 3, 8}, {1, 5, 8, 1}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void masDiag() {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.abs(i - j) + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void masNul() {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void AdditionMultiplicayion() {
        int n = 4;
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];
        int[][] D = new int[n][n];
        System.out.println("matrix A (math.random)");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("matrix B (math.random)");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                B[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("matrix C (sum A+B)");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("matrix D (multiplay A*B)");
        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                D[i][j] = A[i][j] * B[i][j];
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("matrix multiplay on the scaliar)");
        int[][] resulSc = new int[n][n];
        for (int mas[] : resulSc) {
            Arrays.fill(mas, 2);
        }
        for (int i = 0; i < resulSc.length; i++) {
            for (int j = 0; j < resulSc.length; j++) {
                resulSc[i][j] *= 8;
                System.out.print(resulSc[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        int Z[][] = new int[n - 2][n - 2];
        for (int i = 0; i < Z.length; i++) {
            for (int j = 0; j < Z.length; j++) {
                Z[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(Z[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("Det: ");
        int det = ((Z[0][0] * Z[1][1]) - (Z[0][1] * Z[1][0]));
        System.out.println(det);
    }

    public static void main(String[] args) {
        mas();
        System.out.println("Diagonal matrix");
        masDiag();
        System.out.println("Zero matrix");
        masNul();
        AdditionMultiplicayion();
    }

}
