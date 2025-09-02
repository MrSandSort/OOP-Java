package Practice.Number;

public class ReverseNum{
    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = reverseNumber(num);
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reversedNum);
    }

    public static int reverseNumber(int num)
    {
        // 523--> rem= 523%10=3, reversed=0*10+3=3, num=523/10=52
        // 52--> rem= 52%10=2, reversed=3*10+2=32, num=52/10=5
        // 5--> rem= 5%10=5, reversed=32*10+5=325, num=5/10=0
        
        int reversed = 0;
        while (num >0) {
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num /= 10;
        }
        return reversed;
    }
}