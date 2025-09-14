package Practice.String;

import java.util.Scanner;

public class checkUppercase {
    public static void main(String[] args)
    {
        Scanner stringInp= new Scanner(System.in);
        String sus= stringInp.nextLine();
        System.out.println("The given string is uppercased: " + uppercaseCheck(sus));
        stringInp.close();
    }

    public static boolean uppercaseCheck(String s){
        return s.chars().allMatch(Character::isUpperCase);
    }

    // allMatch and noneMatch --> checks and return boolean
}

// s.chars --> bujhnai parne function