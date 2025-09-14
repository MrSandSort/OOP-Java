package Practice.Hashmap;

import java.util.HashMap;

public class RomainToInt {
    
    public static void main(String[] args){

        String stbh= "MCMXCIV";
        int result= IntGetter(stbh);
        System.out.println("The romain value for "+ stbh+ " is "+ result);
    }

    public static int IntGetter(String str){

        HashMap<Character, Integer> romainVal= new HashMap<>();
        romainVal.put('I', 1);
        romainVal.put('V', 5);
        romainVal.put('X', 10);
        romainVal.put('L',50);
        romainVal.put('C',100);
        romainVal.put('D',500);
        romainVal.put('M',1000);

        int sum=0;

        // initialize the sum as 0, then iterate over each character in string
        // get the current value of that character and store it in a current
        // then check for {i+1} if it exceeds the string length
        // 
        
        for(int i=0; i < str.length(); i++){
            int current= romainVal.get(str.charAt(i));
            if(i+1 < str.length() && current < romainVal.get(str.charAt(i+1))){
                sum-= current;
            }
            else{
                sum+=current;
            }

        }

        return sum;

    }
}
