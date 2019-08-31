//перегрузка метода у наследника
package lection22;
class Rod{
    void metProver(int i){
        System.out.println("Peregruzka 1 Int");
    }
    void metProver(String i){
        System.out.println("Peregruzka 2 String");
    }
    void metProver(double i){
        System.out.println("Peregruzka 3 double");
    }
}
class Ext extends Rod{
    void metProver(float i){
        System.out.println("Peregruzka Ext float");
    }
}
public class Task02 {
    public static void main(String arg []){
        Rod r1 = new Rod();
        r1.metProver(1);
        r1.metProver(1.5);
        r1.metProver("sdsd");
        Ext e1 = new Ext();
        e1.metProver(2);
        e1.metProver(2.5);
        e1.metProver("sdsd");
        e1.metProver(1f);
    }
}
