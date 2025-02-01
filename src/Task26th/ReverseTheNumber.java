package Task26th;

import java.util.Scanner;

public class ReverseTheNumber
{
    public static void main(String[] args) {


        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the reversed number
        int reversed = 0;

        // For loop to reverse the number
        for (; number != 0; number /= 10) {
            // Get the last digit of the number
            int digit = number % 10;

            // Build the reversed number by shifting digits
            reversed = reversed * 10 + digit;
        }

        // Output the reversed number
        System.out.println("Reversed Number: " + reversed);

        // Close the scanner object
        scanner.close();


    }
}
