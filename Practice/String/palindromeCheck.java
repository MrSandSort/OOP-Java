package Practice.String;

// palindrome simply refers to a word, phrase, number, or other sequences of 
// characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).

public class palindromeCheck {

    // This is the main method that runs when we execute the program by calling palindrome method.
    public static void main(String[] args) {
        String str="madam";
        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");      
    }}

   // This method checks if the given string is a palindrome. Here, we use two pointers technique.

    public static boolean isPalindrome(String str){
        int left=0, right= str.length()-1;
        while (left<right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left++;
            right--;    
        }
        return true;
    }
}
