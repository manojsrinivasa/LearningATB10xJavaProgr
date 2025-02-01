package Task26th;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String character = sc.next();

        int vowels = 0, consonant = 0;

        for (int i = 0; i <= character.length()-1; i++) {

            char ch= character.charAt(i);
                if (ch == 'a' ||ch == 'e' ||ch == 'i'||ch == 'o'||ch == 'u' ){
                    vowels++;
                } else{
                    consonant++;
                }
        }
        System.out.println("Vowels : "+ vowels);
        System.out.println("Consonants : "+ consonant);
    }
}
