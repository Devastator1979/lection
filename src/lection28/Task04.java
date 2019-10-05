package lection28;

class MyWonderfullClass {
    void go() {
        Bar b = new Bar();
        b.doStuff(
            new Foo() {
                public void foof() {
                    System.out.println("Foofffffff");
                };
            }
        );
    };
}
interface Foo {

    void foof();
}

class Bar {

    void doStuff(Foo f) {
        f.foof();
        
    }
}

public class Task04 {

    public static void main(String arg[]) {
        MyWonderfullClass my = new MyWonderfullClass();
        my.go();

    }
}
