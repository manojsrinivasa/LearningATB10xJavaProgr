package Task30th;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1");
        int number1  = sc.nextInt();

        System.out.println("enter number2");
        int number2  = sc.nextInt();

        System.out.println("enter number3");
        int number3  = sc.nextInt();


        if(number1 > number2 && number1 >number3){
            System.out.println("Number 1 is largest");
        } else if (number2 > number1 && number2 >number3) {
            System.out.println("Number 2 is largest");
        } else {
            System.out.println("Number 3 is largest");
        }

    }
}
