package lection13;

class ConvertNumer {
    String num;
    char [] hex = {'0', '1', '2', '3',
                        '4', '5', '6', '7',
                        '8', '9', 'A', 'B',
                        'C', 'D', 'E', 'F'};
        String[] bin = {"000", "0001", "0010", "0011",
                        "0100", "0101", "0110", "0111",
                        "1000", "1001", "1010", "1011",
                        "1100", "1101", "1110", "1111"};
    String hextobin(String num){
        //String bin = null;
        
        for (int a = 0; a < num.length(); a++){
          char result = num.charAt(a);
          int ind = -1;
          for (int j = 0; j < hex.length; j++){
              if (result == hex[j])
                  ind =j;
              
          }
          
          
          //String S = bin[b];
          System.out.println(result);
          System.out.println(ind);
          System.out.println(bin[ind]);
        }
        
        return  "";    
    }

   
        
}

public class Task03 {

    public static void main(String arg[]) {
        ConvertNumer cn = new ConvertNumer();
        cn.hextobin("1A38");
    }
    
}
