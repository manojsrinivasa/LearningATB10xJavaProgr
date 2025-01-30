package Task29th;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        if (number > 0){
            System.out.println("its positive number");
        } else
        {
            System.out.println("iys negative");
        }

    }
}
