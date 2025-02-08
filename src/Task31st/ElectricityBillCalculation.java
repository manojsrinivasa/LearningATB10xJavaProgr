package Task31st;

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Number of units consumed");
        int units = sc.nextInt();
        if (units<=100){
            System.out.println(units * 0.50);
        } else if (units >= 101 && units <=200) {
            System.out.println(units * 0.75);
        } else if (units >= 201 && units <=300) {
            System.out.println(units * 1.20);
        } else {
            System.out.println(units * 1.50);
    }

    }
}
