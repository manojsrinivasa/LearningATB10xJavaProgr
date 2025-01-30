package Task29th;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a First character");
        char character = sc.next().charAt(0);

        if (character == 'a' ||character == 'e' ||character == 'i' ||character == 'o' ||character == 'u'){
            System.out.println("its Vowels");
        } else {
            System.out.println("its consonant");
        }

    }
}
