package lection.U06;

public class Task04 {
    public static void main(String[] args) {
        // TODO code application logic here
        String x = "Test";
        //System.out.println(x.charAt(3));
        //System.out.println(x.toLowerCase());
        //System.out.println(x.toUpperCase());
        //String temp = x.replace('m', 'M');
        //System.out.println(temp);
        //System.out.println(x.substring(10));
        //System.out.println(x.substring(10, 15));
        String y = "test";
        x = x.toLowerCase();
        if (x.equals(y)){
            System.out.println("Строки равны");
        }
        else {
           System.out.println("Строки не равны");
        } 
    }
    
}
