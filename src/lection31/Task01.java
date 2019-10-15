package lection31;
class Parent{
    static int getValue(){
        return 0;
    }
}
class Child extends Parent{
    
    static int getValue(){
        return 1;
    }
}
public class Task01 {
    public static void main(String args[]){
        Child c = new Child();
        System.out.println(c.getValue());
        Parent p = c;
        System.out.println(p.getValue());
    }
}