//Бинарная вставка
package lection32;

import java.util.Arrays;

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
        //int i =0;
        //if (array != null) {
//            int low = 0, high = array.length, mid;
//            while (low < high) {
//                mid = (low + high) >>> 1;
//                if (high-low<=1) {
//                    i = mid;
//                    break;
//                } else {
//                    if (x < array[mid]) {
//                        high = mid;
//                    } else {
//                        low = mid + 1;
//                    }
//                }
//            }
        int i = Arrays.binarySearch(array, x);
        if (i>0){
            return i;
        }
        else{
            return Math.abs(i)-1;
        }
        
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
        //ar.find(199, array);
        int array3[] = new int [array.length+1];
        int ind = ar.find(199, array);
        for(int i = 0;i<array.length;i++){
            if(i<ind){
                array3[i]=array[i];
            }
            else{
                array3[i+1]=array[i];
            }
        }
        array3[ind]=199;
        for(int i:array3)
        System.out.print(i+ ", ");
        

    }

}
