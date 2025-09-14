package Practice.String;

import java.util.HashMap;

// import java.util.Arrays;

public class MethodsCheck {
    public static void main(String[] args){

        HashMap <String, Integer> checkMe= new HashMap<String, Integer>();
        checkMe.put("sandesh", 1);
        System.out.println(checkMe);

        // String newStr= "Sandesh";
        // working(newStr);

        /* working of hashmaps */

        /* String str1= new String("GenZ");
        String str2= "GenZ";

        System.out.println(str1.equals(str2)); // checks for the values equality
        System.out.println(str1==str2); // it checks the reference objects in a memory */


        // array==> we have java mah pani list of things 

        // int[] arr1= {1,2,3,4,5};
        // int[] arr2= {1,2,3,4,5};

        // System.out.println(Arrays.equals(arr1, arr2));
        // System.out.println(arr1== arr2);
    }

    //work on characters

    // public static void working(String s){
    //     HashMap<String, Integer> countVal= new HashMap<String, Integer>();
        

    //     for (char ch: s.toCharArray()){
    //         String str=String.valueOf(ch).toLowerCase();
    //         countVal.put(str,countVal.getOrDefault(str, 0)+1);
    //     }
    //     System.out.println(countVal);


    // }
}


