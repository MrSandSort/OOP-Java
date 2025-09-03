package Practice.Number;

public class CubingIndexVal {

    // public static void main(String[] args){
    //     int num=123;
    //     String str= String.valueOf(num);

    //     for(int i=0; i<str.length(); i++){
    //         int number= Character.getNumericValue(str.charAt(i));
    //         int cube= number*number*number;
    //         System.out.println(cube);
    //     }
    
    // }

    public static void main(String[] args){
        int num= 456;
        int temp= num;

        System.out.println("Original Number: " + num);
        System.out.print("Cubes of digits: ");

        while(temp>0){
            int digit= temp%10; // digit = 456%10-> 6 
            int cube= digit*digit*digit;
            System.out.print(cube);
            temp=temp/10; // --> to exit loop;
        }

    }
}
