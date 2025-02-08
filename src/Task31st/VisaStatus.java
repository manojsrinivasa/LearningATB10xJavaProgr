package Task31st;

import java.util.Scanner;

public class VisaStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Visa Status");
        boolean status = sc.nextBoolean();

        if (age >= 18 && status == true){
            System.out.println("Person can Travel");
        } else {
            System.out.println("Person cannot Travel");
        }

    }
}
