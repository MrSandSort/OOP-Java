package InputInJava;

import java.util.Scanner;

public class addTwoNum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two numbers to add:");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int sum= num1+num2;
        System.out.println("The sum of two numbers are: "+ sum);
        input.close();
    }
    
}
