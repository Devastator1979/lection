package lection.U06;
public class Task05 {
    public static void main(String[] args) {
        // Составление методов в паравоз
        String x = "abc";
        String y = x.concat("def");
        y = y.toUpperCase();
        y = y.replace('C' , 'X');
        System.out.println("y = " + y);
    }
    
}
