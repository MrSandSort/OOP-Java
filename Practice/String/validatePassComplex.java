package Practice.String;

public class validatePassComplex {
    public static void main(String[] args){

        String srt="Hell0n";
        System.out.println("The given string is complex: "+ checkForComplex(srt));

    }

    public static boolean checkForComplex(String str)
    {
        return str.chars().anyMatch(Character::isUpperCase) &&
        str.chars().anyMatch(Character::isLowerCase)&& str.chars().anyMatch(Character::isDigit);
    }
}
