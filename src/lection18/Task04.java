package lection18;
class Moof{
    private int moofValue;
    Moof(int val){
        moofValue = val;
    }
    public int getMoofValue(){
        return moofValue;
    }
    public boolean equals(Object o){
        if ((o instanceof Moof)&&(((Moof)o).getMoofValue()==this.moofValue))
            return true;
        
        else {
            return false;
        }
    }
}
    
    
public class Task04 {
    public static void main (String arg []){
        Moof one = new Moof(8);
        Moof two = new Moof(9);
        if (one.equals(two)){
            System.out.println("one and two are equals");
        }
        else{
            System.out.println("one and two are non equals");
        }
    }
}
