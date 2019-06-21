package lection.U05;
public class Task03 {
     public static void main(String[] args) {
        // TODO code application logic here
         int[] array = new int[5];
        array[0] = 5;
        array[1] = 12;
        array[2] = 53;
        array[3] = 2;
        array[4] = 36;
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println(array[i]);
        }
        
        for (int i : array)
        {
            System.out.println(i);
        }

    }
}
