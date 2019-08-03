package lection15;
enum CoffeeSize {BIG,HUGE,OVERWHELMING};
class Cofee{
    CoffeeSize size;
}
class Cofee2{
    enum CoffeeSize {BIG,HUGE,OVERWHELMING};
    CoffeeSize size;
}
public class Task02 {
    public static void main(String[] arg){
        Cofee drink = new Cofee();
        drink.size = CoffeeSize.BIG;
        System.out.println(drink.size);
        
        Cofee2 drink2 = new Cofee2();
        drink2.size = Cofee2.CoffeeSize.OVERWHELMING;
        System.out.println(drink2.size);
        
        //CoffeeSize cs = CoffeeSize.BIG;
        //System.out.println(cs);
    }
}