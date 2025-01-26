package Task25th;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        
        int vowels = 0;
        int consunants = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String name =sc.next();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                vowels++;
            }
            else {
                consunants++;
            }

            
        }

        System.out.println(vowels);
        System.out.println(consunants);
    }
}
