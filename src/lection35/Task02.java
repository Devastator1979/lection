//race condition - решение применение синхронизации
//dead lock - 
package lection35;
class DeadlockRisk{
    class Resource{
        public int value;    
    }
    private Resource resourceA =new Resource();
    private Resource resourceB =new Resource();
    public int read(){
        synchronized(resourceB){
            synchronized(resourceA){
                return resourceA.value+resourceB.value;
            }
        }
    }
    public void write(int a, int b){
        synchronized(resourceB){
            synchronized(resourceA){
                resourceA.value=a;
                resourceB.value=b;
            }
        }
    }
    class PotokA implements Runnable{
        public void run(){
            for (int i=0;i<10000;i++){
                read();
                System.out.println("Итерация read "+ i);
            }
        }
    }
    class PotokB implements Runnable{
        public void run(){
            for (int i=0;i<10000;i++){
                write(5,10);
                System.out.println("Итерация write "+ i);
            }
            
        }
    }
}

public class Task02 {
    public static void main(String args[]){
        
        DeadlockRisk r = new DeadlockRisk();
        DeadlockRisk.PotokA a = r.new PotokA();
        DeadlockRisk.PotokB b = r.new PotokB();
         Thread tA = new Thread(a);
         Thread tB = new Thread(b);
         tA.start();
         tB.start();
        
    }
}