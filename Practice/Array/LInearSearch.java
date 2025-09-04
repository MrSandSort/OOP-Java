package Practice.Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class LInearSearch {
    public static void main(String[] args){

        int[] arry={1,2,9,101,5};
        System.out.println(LinearSrc(arry, 100));
        LinSearch(arry, 99).ifPresent(System.out::println);
    }

    public static boolean LinearSrc(int[] arr, int item){

        for(int val:arr){
            if(val== item){
                return true;
            }
        }

        return false;
    }

    public static OptionalInt LinSearch(int[] arr1, int itm){

        return Arrays.stream(arr1).filter(x->x== itm).findFirst();
    }
}
