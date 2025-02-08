package Task31st;

import java.util.Scanner;

public class BonusCalculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Years of Experience");
        int exp = sc.nextInt();

        System.out.println("salary");
        int salary = sc.nextInt();

        if (exp < 1 ){
            System.out.println("No bonus");
        } else if (exp < 1 && exp < 3){
            System.out.println(salary * 0.05);
        } else if (exp < 4 && exp < 6){
            System.out.println(salary * 0.10);
        } else {
            System.out.println(salary * 0.15);
        }


    }
}