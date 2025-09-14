package Practice.Hashmap;

import java.util.HashMap;

public class repeatVowel {
    
    public static void main(String[] args){

        String strings="Heywe you";
        vowelRepeater(strings);
        
    }

    public static void vowelRepeater(String s){
        String text= s.toLowerCase();
        HashMap <String, Integer> vowelRepeat = new HashMap<>();

          for (char c : text.toCharArray()) {

            if("aeiou".indexOf(c)!= -1){
               String key= String.valueOf(c);
               vowelRepeat.put(key, vowelRepeat.getOrDefault(key, 0)+1);
            }
            // if ("aeiou".indexOf(c) != -1) {
            //     String key = String.valueOf(c); 
            //     vowelRepeat.put(key, vowelRepeat.getOrDefault(key, 0) + 1);
            // }
        }

        System.out.println(vowelRepeat);

        

    }
}
