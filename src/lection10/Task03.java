package lection10;
public class Task03 {
    public static void main(String arg[]){
        
        Integer i = Integer.valueOf("42");
        int b = i+1;
        i = new Integer (b);
        System.out.println(i);
        
        // unrepak автораспаковка
        Integer i1 = Integer.valueOf("42");
        //repak автоупаковка
        i1 = i1+1;
        System.out.println(i1);
        
    }
    
}
