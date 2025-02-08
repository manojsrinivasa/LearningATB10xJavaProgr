package TaskFeb1st;

import java.util.Scanner;

public class NumberIsDivisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number % 5 == 0 && number % 11 == 0){
            System.out.println("divisible by 5 and 11");
        } else {
            System.out.println("not divisible by 5 and 11");
        }


    }
}
