package lection10;

public class Task04 {

    public static void main(String arg[]) {
        int i = 0;
        String c = "coza";
        String l = "Loza";
        String w = "woza";
        boolean temp;
        int a = 0;
        for (i = 1; i <= 110; i++) {
            temp = false;
            System.out.print(" ");
            if (i % 3 == 0) {
                temp = true;
                System.out.print(c);
            }

            if (i % 5 == 0) {
                temp = true;
                System.out.print(l);
            }

            if (i % 7 == 0) {
                temp = true;
                System.out.print(w);
            }

            if (temp != true) {
                System.out.print(i);

            }
            a++;
            if (a % 11 == 0) {
                System.out.println();
            }

        }

    }
}
