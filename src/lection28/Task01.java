//Анонимные классы 
package lection28;
class Popcorn{
    public void pop(){
        System.out.println("popcorn");
    }
}
class Food{
    Popcorn p = new Popcorn(){
        @Override
        public void pop(){
            System.out.println("anonymos popcorn");
        }
        public void foo(){
            System.out.println("foo");
        }
    };
}

public class Task01 {
    public static void main(String args[]){
        Food f = new Food();
        f.p.pop();
    }
}