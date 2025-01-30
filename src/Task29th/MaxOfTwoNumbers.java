package Task29th;

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a First number");
        int number1 = sc.nextInt();
        System.out.println("enter a Second number");
        int number2 = sc.nextInt();

        if (number2 > number1){
            System.out.println("Number 2 is grater than number 1");
        } else {
            System.out.println("Number 1 is Grater than number 2");
        }

    }
}
