package lection32;

class SortAray {

    public int[] Sort(int[] array) {
        int i = 0;
        int goodPairsCounter = 0;
        while (true) {
            if (array[i] > array[i + 1]) {
                int q = array[i];
                array[i] = array[i + 1];
                array[i + 1] = q;
                goodPairsCounter = 0;
            } else {
                goodPairsCounter++;
            }
            i++;
            if (i == array.length - 1) {
                i = 0;
            }
            if (goodPairsCounter == array.length - 1) {
                break;
            }
        }
        return array;
    }
    

    public int find(int x, int array[]) {
        int i = -1;
        if (array != null) {
            int low = 0, high = array.length, mid;
            while (low < high) {
                mid = (low + high) >>> 1;
                if (high-low<=1) {
                    i = mid;
                    break;
                } else {
                    if (x < array[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i+1;
    }
public void newArray(){
   // int i ;
}
    void print(int array[]) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("End Array");
    }
}

public class Task01 {

    public static void main(String args[]) {
        int array[] = {163, 300, 184, 191, 174, 185, 196, 187, 200, 201};
        SortAray ar = new SortAray();
        ar.print(array);
        ar.Sort(array);
        ar.print(array);
        ar.find(199, array);
        System.out.println(ar.find(199, array));
        

    }

}
