package lection20;
class Employer{
    private String Name;
    private String Family;
    private int Cash;
    private String Prof;
    
    public Employer (String Name, String Family, int Cash, String Prof){
        this.Name = Name;
        this.Family = Family;
        this.Cash = Cash;
        this.Prof = Prof;
              
    }
    public Employer(){
        
    }
    
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name; 
    }
    public String getFamily(){
        return Family;
    }
    public void setFamily(String Family){
        this.Family = Family; 
    }
    public int getCash(){
        return Cash;
    }
    public void setCash(int Cash){
        this.Cash = Cash; 
    }
    public String getProf(){
        return Prof;
    }
    public void setProf(String Prof){
        this.Prof = Prof; 
    }
    public String toString(){
        return "Name = " + Name + "; Family = " + Family + "; Cash = " + Cash + "; Prof = " + Prof;
    }
    @Override
    public boolean equals(Object o){
        if (((this.Name).equals(((Employer)o).Name))
                && ((this.Family).equals(((Employer)o).Family))
                && (this.Cash == ((Employer)o).Cash)
                && ((this.Prof).equals(((Employer)o).Prof)))
            return true;
        
        else {
            return false;
        }
        
    }
    
    @Override
    public int hashCode(){
        return Name.length() + Family.length() + Prof.length();
    }
}
public class Task03 {
    public static void main(String arg []){
         //Employer emp1 = new Employer("Vasya","Nikolaev", 5000,"Dvornik");
         //Employer emp2 = new Employer("Kolya","Vasilyev", 15000,"Manager");
         //System.out.println(emp1);
         //System.out.println(emp2);
         String str = "Ivanov,Ivan,300,manager--Petrov,Petr,450,dev";
         String [] strEmp = str.split("--");
         Employer [] arr = new Employer[100];
         int i = 0;
         for(String s:strEmp){
            //System.out.print(s);
            String [] sEpm = s.split(",");
            
            arr [i] = new Employer(sEpm[0],sEpm[1],Integer.parseInt(sEpm[2]),sEpm[3]);
            i++;
         }
         
         for(int a=0;a<i;a++){
             System.out.println(arr[a]);            
         }
         
    }
}
