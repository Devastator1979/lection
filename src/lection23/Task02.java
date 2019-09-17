package lection23;
abstract class Operation{
    public abstract int calculate(int a, int b);
}
class Addition extends Operation{
    @Override
    public int calculate(int a, int b){
        return a+b;
    }
}
class Subtsraction extends Operation{
    @Override
    public int calculate(int a, int b){
        return a-b;
    }
}
public class Task02 {
    public static void main(String arg []){
        Operation o1 = new Addition();
        Operation o2 = new Subtsraction();
        int res1 = o1.calculate(2, 3);
        int res2 = o2.calculate(3, 5);
        System.out.println(res1);
        System.out.println(res2);
    }
}
