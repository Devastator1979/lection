package lection20;
class BadOO{
    private int size;
    private int weight;
    
    public int getSize(){
        return size;
    }
    public int getWeigth(){
        return weight;
    }
    public void setSize(int Size){
        if (size>=0){
            this.size = size;
        }
        else {
            System.out.println("Vasya idid lesom!!");
        }
        this.size = size; 
    }
    public void setWeight(int Weight){
        this.weight = weight; 
    }
}
public class Task02 {
    
}
