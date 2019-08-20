//Shaxmatka
package lection19;
class Sell{
    int number;
    char symbol;
    boolean color;
    boolean busy;
    
    Sell (int number, char symbol, boolean color, boolean busy){
        this.number = number;
        this.symbol = symbol;
        this.color = color;
        this.busy = busy;
              
    }
    public boolean equals(Object o){
        if ((o instanceof Sell)&&(this.number == ((Sell)o).number)
                && (this.symbol == ((Sell)o).symbol)
                && (this.busy == ((Sell)o).busy)
                && (this.color == ((Sell)o).color))
            return true;
        
        else {
            return false;
        }
        
    }
    @Override
    public int hashCode(){
        return number + symbol;
    }
}
public class Task03 {
    public static void main(String arg[]){
        
    }
}
