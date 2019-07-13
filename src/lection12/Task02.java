package lection12;
public class Task02 {
    public static void main(String arg[]){
        double sr = 0;
        double sum = 0;
        int n = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            sum += x;
            n++;
            x = (int) (Math.random() * 20);
        }
        if (n != 0) {
            sr = sum / n;
        } else {
            sr = 0;
        }
        System.out.println("medium: "+sr);
    }  
}
