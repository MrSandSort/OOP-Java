package Practice.Array;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){

        int[] numbers= {3,-1,2,9,7,4,-10};
        System.out.println("The sorted list is given below:");
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void bubbleSort(int[] arr){
        int length= arr.length; // taking the length
        for(int i=0; i<length-1; i++ ){ // go from index 0 till last second value --> so the loop executes 6 times in the above value
            for(int j=0; j<length-i-1; j++) // go from index 0 to 7-0-1--> 6
            {
                int temp=0;
                if(arr[j]> arr[j+1]){
                    temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;

                }
            }

        }
    }
    
}
