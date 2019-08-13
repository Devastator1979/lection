package lection17;
public class Task02 {
    public static void main(String arg []){
        double posinf = 5.1/0;
        double neginf = -5.1/0;
        double poszero = 1e-40f/1e10f;
        double negzero = -1e-40f/1e10f;
        
        System.out.println(posinf);
        System.out.println(poszero);
        System.out.println(neginf);
        System.out.println(negzero);
        System.out.println();
        System.out.println(posinf>neginf);
        System.out.println(posinf<neginf);
        System.out.println(posinf==neginf);
        System.out.println();
        System.out.println(poszero>negzero);
        System.out.println(poszero<negzero);
        System.out.println(poszero==negzero);
        
        
    }
}
