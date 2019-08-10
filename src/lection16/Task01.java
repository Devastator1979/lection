package lection16;
enum CoffeeSize{
    //8,10& 16 area passed to the constructor
    BIG(8, "qwe"), HUGE(10, "olkijm"), OWERWHELMING(16, "lkjm");
    
    CoffeeSize(int ounces, String name){ //constructor
        this.ounces=ounces;
        this.name = name;
    }

    private String name;
    
    private int ounces; //an instance variable
    
    public int getOunces(){
        return ounces;
    }
    public String getname(){
        return name;
    }
}
class Coffee{
    CoffeeSize size;
}
public class Task01 {
    public static void main(String[] arg){
        Coffee drink1 = new Coffee();
        drink1.size = CoffeeSize.BIG;
        System.out.println(drink1.size.getOunces());
        
        Coffee drink2 = new Coffee();
        drink2.size = CoffeeSize.HUGE;
        System.out.println(drink2.size.getOunces());
        // for iech
        for(CoffeeSize value:CoffeeSize.values()){
            System.out.print(value + " ");
            System.out.print(value.getOunces() + " ");
            System.out.println(value.getname());
        }
    }
}
