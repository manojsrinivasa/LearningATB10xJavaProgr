package Task31st;

import java.util.Scanner;

public class NumberIsPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int originalno = number;
        int rem=0;
        int rev =0;
        while(number !=0){
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        if (originalno == rev){
            System.out.println("Its palindrome");

        } else {
            System.out.println("not a palindrome");
        }

    }
}
