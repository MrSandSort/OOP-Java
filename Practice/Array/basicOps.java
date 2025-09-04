package Practice.Array;

import java.util.Arrays;

public class basicOps {
    
    public static void main(String[] args)
    {
       int[] arr1={4,5,6,2}; 
       // --> first iteration: {2,5,6,4} --> second iteration :{2,6,5,4}
       Arrays.stream(reverseArray2(arr1)).forEach(System.out::println);
    }

    public static int[] reverseArray(int[] arr){
        int[] result= new int[arr.length];

        for(int i=0; i< arr.length; i++){
            result[i]= arr[arr.length-1-i];
        }

        return result;

    }


    public static int[] reverseArray2(int[] arr2)
    {
        for(int i=0; i<(arr2.length)/2;i++){ 

            // int i=0 -> temp= arr[0]--> 4, arr[0]--> 4-1-0--> 3 --> arr[3]-->4

            int temp= arr2[i];
            arr2[i]= arr2[arr2.length-1-i];
            arr2[arr2.length-1-i]= temp;
        }

        return arr2;
    
    }
}