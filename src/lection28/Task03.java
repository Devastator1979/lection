package lection28;
interface Cookable{
    public void cook();
}
class Food1{
    Cookable c = new Cookable(){
      public void cook(){
          System.out.println("anonymus cookable implement");
      }  
    };
}
public class Task03 {
    public static void main(String args[]){
        Food1 f = new Food1();
        f.c.cook();
    }
}
