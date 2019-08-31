//Сделать класс тритона. Продемонстрировать ситуацию неправильного даункастинга к классу фрог.
package lection22;
class Amphibian{
    void moveInWater(){
        System.out.println("Go in Water");
    }
    void moveInLand(){
        System.out.println("Go in Land");
    }
}
class Frog extends Amphibian{
    
    @Override
    void moveInWater(){
        System.out.println("Frog Go in Water");
    }
    @Override
    void moveInLand(){
        System.out.println("Frog Go in Land");
    }
    
    void sayKva(){
        System.out.println("KvaKva");
    }
}
class Triton extends Amphibian{
    
}
public class Task01 {
    public static void main(String arg []){
        Amphibian f1 = new Frog();
        f1.moveInLand();
        f1.moveInWater();
        //f1.sayKva();
        //downcast
        Frog f2 = (Frog) f1;
        f2.sayKva();
        Amphibian t1 = new Triton();
        t1.moveInLand();
        t1.moveInWater();
        //Неправильное преобразование которое не видит компилятор.
        //С тритоном пытаемся работать как с объектом фрог.
        Frog t2 = (Frog)t1;
    }
}
