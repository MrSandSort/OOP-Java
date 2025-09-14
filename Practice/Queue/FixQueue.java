package Practice.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FixQueue {
    public static void main(String[] args){
        Queue<Integer> queue= new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(7);
        
        ArrayList<Integer> arr= new ArrayList<>();

        System.out.println(queue);

        for (int q:queue){
          arr.add(q);
        }
        
        System.out.println(arr);

    }
    
}
