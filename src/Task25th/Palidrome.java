package Task25th;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        String reverseString = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = sc.next();


        for (int i = text.length()-1; i >= 0 ; i--) {
            reverseString = reverseString + text.charAt(i);
        }

        if (text.equals(reverseString)){
            System.out.println("Palidrome");
        }
        else {
            System.out.println("not Palidrome");
        }

    }
}
