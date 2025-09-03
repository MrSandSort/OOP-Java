package Practice.Array;

import java.util.Arrays;

public class maxNum {
    public static void main(String[] args){
     int[] numbers={5,8,1,10};   
     System.out.println("The max number from the array is: "+ findMax(numbers));
    }

    public static int findMax(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
}
