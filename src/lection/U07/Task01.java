package lection.U07;
public class Task01 {
     static void hello(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        // TODO code application logic here
   
        goodBay();
        hello(); // вызов метода
        goodBay();
    }
    
    // объявление метода с именем goodBay
    static void goodBay(){
        System.out.println("Good bay ");
    }
    }
    


// FIXME измените код в методе main, чтобы программа вывела 
// Good bay
// Hello
// Good bay