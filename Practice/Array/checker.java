package Practice.Array;

import java.util.Arrays;

public class checker {


    public static void main(String[] args){
        int[] arr2= new int[]{4,5,6,7};
        Arrays.stream(arr2).map(x-> (x*2)).forEach(System.out::println);
    }

    public static boolean check(int num){
        // check if given value is number or not
       return true;
    }
}
