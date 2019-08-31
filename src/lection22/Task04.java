//пример полиморфизма через вызов метода
package lection22;
class Instrument{
    void play(){
        
    }
    static void tune (Instrument i ){
        i.play();
    }
}
class Kontrobas extends Instrument{
    @Override
    void play(){
        System.out.println("Play Kontrobas");
    }
}
class Baraban extends Instrument{
    @Override
    void play(){
        System.out.println("Play Baraban");
    }
}
class Truba extends Instrument{
    @Override
    void play(){
        System.out.println("Play Truba");
    }
}
public class Task04 {
    public static void main(String arg []){
        Kontrobas k = new Kontrobas();
        Instrument.tune(k);
        Baraban b = new Baraban();
        Instrument.tune(b);
        Truba t = new Truba();
        Instrument.tune(t);
    }
}
