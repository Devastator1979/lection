package lection10;
public class Task03 {
    public static void main(String arg[]){
        
        Integer i = Integer.valueOf("42");
        int b = i+1;
        i = new Integer (b);
        System.out.println(i);
        
        // unrepak автораспаковка
        Integer y = Integer.valueOf("567");
        Integer x = y;
        //repak автоупаковка
        y++;
        System.out.println(x == y);
        System.out.println(y);
        
    }
    
}
