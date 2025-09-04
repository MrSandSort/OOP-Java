package Practice.String;

public class reverseWord {
    public static void main(String[] args){
        String nr="Hey he is a guy ";
        System.out.print("Reversed word: "+ reverseEachWord(nr));
    }
    public static String reverseStr(String str){
        StringBuilder sb= new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseEachWord(String str2){
        if(str2== null || str2.isEmpty()){
            return "";
        }

        StringBuilder result= new StringBuilder(str2);
        String[] words= str2.split(" ");

        for (String word:words){
            result.append(reverseStr(word));
            result.append(" ");
        }
        return result.toString().trim();
    }

    
}
