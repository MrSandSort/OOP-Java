package Practice.Array;

import java.util.Arrays;

// arr[1]

public class rotateAnArray {
    public static void main(String[] args) {
        int[] arr={4,3,2,1,9};
        Arrays.stream(RotateArray(arr)).forEach(System.out::println);
    }

    public static int[] RotateArray(int[] arr2){

        for(int i=1; i< arr2.length; i++){
            int temp= arr2[i];
            arr2[i]=arr2[i-1];
            arr2[i-1]= temp;
        }

        return arr2;
    }
}


// arr2=[4,3,2,1,9]

// rotate--> [3,2,1,9,4] = output

// 1,2,3,4

