package lection11;
public class Task01 {
    public static void main(String arg[]){
        int a = 1542;
        while (a>0){
            System.out.print(a%10);
            a = a/10;
            if (a%10>=1){
                System.out.print(",");
            }
        }
    }
    
}
//Убрать запятую в конце