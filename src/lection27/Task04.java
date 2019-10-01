package lection27;
class MyOuter1{
    private String x = "Outer2";
            void doStuff(){
                class MyInner{
                    public void seeOuter(){
                        System.out.println("Outer x is " + x);
                    }
                }
                MyInner mi = new MyInner();
                mi.seeOuter();
            }
        }
public class Task04 {
    public static void main(String args[]){
        MyOuter1 m1 = new MyOuter1();
        m1.doStuff();
    }
}
