package lection12;
public class Task01 {
    public static void main(String arg[]){
        int i = 3;
        int mask =1;
        String str = "";
        for(int cnt = 0; cnt<32;cnt++){
            if((i & mask) > 0){
                str = "1" + str;
            }
            else{
                str = "0" + str;
            }
            System.out.println(str);
            
            mask = mask << 1;
        }
        
    }
    
}
