package TaskFeb7th;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int fact = 0;
        for (int i = number; i >0 ; i--) {
           fact= fact + i;
        }

        System.out.println(fact);


    }
}
