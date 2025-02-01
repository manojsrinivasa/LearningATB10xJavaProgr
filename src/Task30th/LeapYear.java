package Task30th;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if(year % 4 == 0 ){
            System.out.println("its leap year");

        } else
        {
            System.out.println("not a leap yer");
        }

    }
}
