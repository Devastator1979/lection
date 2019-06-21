package lection.U07;
public class Task04 {
    public static void main(String[] args) {
        // TODO code application logic here
         int a = 1;
        // а является фактическим параметром метода
        a(a);
        System.out.println(a);
        a = 2;
        а(a);
        // FIXME в одном класссе нельзя обявлять методы с одинаковым именем и
        // набором формальных параметров. Объясни почему компилятор не выдает
        // ошибки в данном примере для метода с именем а
        // System.out.println(a(a));
        // a(a = 3);
        // Передача параметров в метод всегда происходит по значению
        concat(4, "test");
        concat(5, "bo-bo");
    }
    // метод объявлен с одним формальным параметром
    static void a(int a) {
        // a = 3
        System.out.println(a);
    }
    // метод объявлен с одним формальным параметром
    static void а(int a) {
        System.out.println(a + 1);
    }
    // метод объявлен с двумя формальными параметрами
    static void concat(int a, String s) {
        System.out.println(s + a);
    }
    
    
}
