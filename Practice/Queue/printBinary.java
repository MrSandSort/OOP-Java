package Practice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class printBinary {
    public static void printBinaryy(int n){

        if(n<=0){
            System.out.println();
        }

        Queue<Integer> queue= new LinkedList<>();
        queue.add(1);

        for(int i=0; i<n; i++){
            int current= queue.remove();
            System.out.println(current);

            queue.add(current*10);
            queue.add(current*10+1);

        }

        System.out.println();

    }

    public static void main(String[] args){
        System.out.println();
        printBinaryy(5);
    }
}
