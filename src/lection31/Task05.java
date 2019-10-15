//Очередь queue PriorityQueue
package lection31;
import java.util.Comparator;

import java.util.PriorityQueue;
 class PQsort implements Comparator<Integer>{
    @Override
    public int compare(Integer one, Integer two){
        return two - one;
    }
}

public class Task05 {
    public static void main(String [] args){
        int [] ia = {1,5,3,7,6,9,8};
        PriorityQueue <Integer> pq1 = new PriorityQueue <>();
        for(int x : ia)
            pq1.offer(x);
        //System.out.println(pq1.size());
        for(int x : ia)
            System.out.print(pq1.poll()+" ");
        System.out.println("");
        PQsort pqs = new PQsort();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(10,pqs);
        for(int x : ia)
            pq2.offer(x);
        System.out.println("size " + pq2.size());
        System.out.println("size " + pq2.peek());
        System.out.println("size " + pq2.size());
        System.out.println("size " + pq2.poll());
        System.out.println("size " + pq2.size());
    }
}
