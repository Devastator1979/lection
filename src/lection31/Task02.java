package lection31;
class Animal{
    void eat(){
        System.out.println("Animal eat");
    }
}
class Dog extends Animal{

    Dog(String aiko) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void eat(){
        System.out.println("Dog eat");
    }
    void findAndEat(){
        eat();
        super.eat();
    }
}
public class Task02 {
    public static void main(String arg[]){
        Dog d = new Dog();
        d.findAndEat();
    }
}
