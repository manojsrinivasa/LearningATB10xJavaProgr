package Task26th;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        
        int firstNumber = 0;
        int SecondNumber =1;
        int fact =0;
        for (int i = 0; i <= number; i++) {

            fact = firstNumber + SecondNumber;
            System.out.println(fact);
            firstNumber = SecondNumber;
            SecondNumber  = fact;

        }
    }
}
