package lection.U09;

class Point {

    int x;
    int y;
}

public class Task05 {

    public static void main(String arg[]) {
        Point p[][];
        p = new Point[10][10];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].length; j++) {
                p[i][j] = new Point();
                p[i][j].x = i + 1;
                p[i][j].y = j + 1;
            }
        }
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                System.out.print("x = " + p[i][j].x + " y = " + p[i][j].y + "\t");
            }
            System.out.println();
        }
    }
}
