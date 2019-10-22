//Thread поток
package lection33;
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Important job running in MyThread");
    }
}
public class Task03 {
    public static void main(String args[]){
        MyThread t = new MyThread();
        t.start();
         System.out.println("Thread main");
    }
}
