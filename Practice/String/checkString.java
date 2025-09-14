package Practice.String;

public class checkString {
    public static void main(String[] args) {

        String str = "Sandesh";
        String reversedStr = checkfor(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
        System.out.println();

        String sentence = "She is a nice person";
        System.out.println("Original Words: "+ sentence);
        System.out.println("Reversed Words: " + reverseWords(sentence));
    }

    // Reverse a single string
    public static String checkfor(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    // Reverse each word in a sentence
    public static String reverseWords(String str1) {
        String[] arr = str1.split(" ");
        StringBuilder stb = new StringBuilder();

        for (String word : arr) {
            stb.append(checkfor(word)); // reverse each word
            stb.append(" ");           // add space between words
        }

        return stb.toString().trim(); // remove trailing space
    }
}
