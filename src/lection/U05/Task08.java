package lection.U05;
public class Task08 {
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] numbers = new int[][] {{3, 2, 1} , {5, 3, 7}};
        
        for (int[] i : numbers)
        {
            for (int j : i)
            {
                System.out.println(j);
            }
            System.out.println("-------------------");
        }
    }
    
}
