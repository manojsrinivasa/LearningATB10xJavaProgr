package Task30th;

import java.util.Scanner;

public class CharacterIsAlphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character:");
        char ch = sc.next().charAt(0);

        if(ch >= 'a'  && ch <= 'z'){
            System.out.println(ch + " is an Alphabet.");
        } else {
            System.out.println(ch + " is not an Alphabet.");
        }

    }
}
