package Practice.String;

public class reverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reversedString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String reversedString(String str) {
        StringBuilder reversed= new StringBuilder();
        for(int i= str.length()-1;i>=0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

// String Builder is a mutable sequence of characters. 
// It is used to create and manipulate strings efficiently, especially when performing multiple modifications, 
// such as appending, inserting, or deleting characters. Unlike the String class, which creates a new object for every modification (since Strings are immutable), StringBuilder allows for in-place modifications, making it more memory and performance efficient for scenarios involving frequent changes to string data.

