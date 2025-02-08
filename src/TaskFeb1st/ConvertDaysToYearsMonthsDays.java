package TaskFeb1st;

import java.util.Scanner;

public class ConvertDaysToYearsMonthsDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        int inYear = 365;
        int inMonth = 30;
        int remainder= 0;
        int years = 0;
        int month =0;

        if(number != 0){
            years = number  / inYear;
            remainder = number % inYear;
        }
        System.out.println("Years: "+years);
        if (remainder != 0){
            month = remainder / inMonth;
            remainder = remainder % inMonth;
        }
        System.out.println("Month: "+month);
        System.out.println("Days: "+ remainder);



    }
}
