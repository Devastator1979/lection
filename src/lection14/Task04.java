package lection14;
class TestStatic{
    int i =7;
    static int j = 10;
    
    static void foo(){
        /*TestStatic ts = new TestStatic();*/
        /* System.out.println(ts.i); /*Первое правило*/
        /*boo();                    /*Второе правило*/
    }
    void boo(){
        System.out.println(i);
    }
    
}
public class Task04 {
    public static void main(String arg[]){
        
    }
    
}
