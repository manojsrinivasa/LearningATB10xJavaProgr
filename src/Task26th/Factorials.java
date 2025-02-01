package Task26th;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        int fact =1;

        for (int i =number ; i >0; i--) {
            fact = fact * i;

        }

        System.out.println(fact);
    }
}
