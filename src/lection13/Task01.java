package lection13;

class Animal{
    String name;
    int age;
    Animal (String name){
        super();
        this.name = name;
        System.out.println("Class Animal 1 argument");
    }
    Animal (String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Class Animal 2 argument");
    }
    Animal (){
        this.name = "none";
        this.age = 0;
        System.out.println("Class Animal zero argument");
        System.out.println(name +" "+ age);
    }
}
class Horse extends Animal{
    Horse(String name, int age){
        super(name, age);
        System.out.println("Class Horse 2 argument ");
    }
    Horse(String name){
        super(name);
        System.out.println("Class Horse 1 argument ");
    }
    Horse (){
        System.out.println("Class Horse zero argument");
        System.out.println(name +" "+ age);
    }
}
public class Task01 {
    public static void main(String arg[]){
        new Animal();
        new Horse ();
        //new Horse("H1", 3);
        //new Animal ("gh1", 8);
    }
}
