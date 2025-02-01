package Task30th;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1");
        int number1  = sc.nextInt();

        System.out.println("enter number2");
        int number2  = sc.nextInt();

        if(number2 < number1){
            System.out.println("Number 2 is Smallest");
        } else {
            System.out.println("Number 1 is Smallest");
        }

    }
}
