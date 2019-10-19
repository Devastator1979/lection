package lection32;
import java.util.*;
public class Task03 {
    public static void main(String args[]){
        String str = "ab1c2d334";
        Map<Integer, Integer> st = new HashMap<>();
        for(int i=0;i < str.length(); i++){
            
            int x=str.charAt(i);
            if(Character.isDigit(x)==true){
                st.put(i, x);
            }
        }
    System.out.println(st.size());
    System.out.println(st);
    
    }
    
}
