package Task31st;

import java.util.Scanner;

public class LoanEligible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();

        System.out.println("Enter the salary");
        Double salary = sc.nextDouble();

        System.out.println("Enter the Credit Score");
        int credit_Score = sc.nextInt();

        if (age >= 18 && age <80){

            if (salary >= 30000){

                if( credit_Score >= 650 && credit_Score<850){
                    System.out.println("Eligible for a Loan");
                }
            }
        }   else {
            System.out.println("Not Eligible for a Loan");
        }





    }
}
