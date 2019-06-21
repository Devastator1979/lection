package lection.U05;
public class Task05 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array2 = new int [] { 3, 53, 7, 15, 5, 7};
        
        int[] mas = array2;
        mas[0] = 100;
        mas[1] = 200;
        array2[4] = 555;
        array2[5] = 444;
        
        for (int i : array2 )
           {
           System.out.print(i + " ");
           }
        for (int i : mas )
           {
           System.out.print(i + " ");
           }
    }
    
}
