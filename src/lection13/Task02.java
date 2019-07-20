package lection13;

class Vector {

    private int vx, vy;
    protected double length;

    public Vector(int x, int y) {
        super();
        vx = x;
        vy = y;
        length = Math.sqrt(vx * vx + vy * vy);
        System.out.println("Вызываем конструктор 2 аргумента");
        System.out.println("Вызываем конструктор 2 аргумента " + length);
    }

    public Vector(int x1, int y1, int x2, int y2) {
        this (x2-x1,y2 -y1);
        System.out.println("Вызываем конструктор 4 аргумента");
    }
}

public class Task02 {

    public static void main(String arg[]) {
        //new Vector (3,8);
        new Vector (3,8,5,2);
    }
}
