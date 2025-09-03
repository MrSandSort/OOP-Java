package Practice.Array;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args){
        int[] numbers= {3,-1,2,9,7,4,-10};
        System.out.println("The sorted list is given below:");
        selectSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void selectSort(int[] arr){
        int arrLength= arr.length;
        for(int i=0; i< arrLength-1; i++){
         int min_idx= i;
         for(int j= min_idx+1; j< arrLength;j++)
         {
            if(arr[j]< arr[min_idx])
            { 
                min_idx= j;
            }
         }
         int temp= arr[min_idx];
         arr[min_idx]= arr[i];
         arr[i]= temp;
            
        }

    }
}
