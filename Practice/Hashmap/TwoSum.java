package Practice.Hashmap;

import java.util.Arrays;
import java.util.HashMap;

// we have target , so now go through each index and find value and subtract from that
// finding will have: target 10--> so for first loop, finding--> 10-5-> 5 now look for other 5;
// if other 5 is found return that with key and value
// if not found store in a hashmap with key:value pair

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers= new int[]{5,1,9,2};
        Arrays.stream(findTwoSum(numbers, 7)).forEach(System.out::println);
    }

    // arr1=[5,1,9,2] , target--> 7 , target-arr1[i]= 7-5=2 {number:[]}

    public static int[] findTwoSum(int[] arr1, int target) {

        HashMap<Integer, Integer> findSums = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr1.length; i++) {
            int finding = target - arr1[i];

            if (findSums.containsKey(finding)) {
                return new int[] { findSums.get(finding), i };
            }
            findSums.put(arr1[i], i);
        }

        return null;
    }
}


/* 
 * problem solving on this: we have to find sum and return;
 * first loop through each elements and subtract from the target;
 * So we need to find this subtracted value in the Hashmaps;
 * Then, check if that key exists --> return that keys with values
 * Otherwise, create one key and store and return value
 * 
 */