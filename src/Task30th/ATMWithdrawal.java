package Task30th;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {

        int account_balance = 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int amount = sc.nextInt();

        if((amount > 0) && (amount % 100 == 0) && (amount < account_balance)){

            account_balance = account_balance - amount;

            System.out.println("you have withdrawed the amount: "+ amount);

        } else {
            System.out.println("Enter the amount greater then zero");
            System.out.println("Amount entered should be multiple of 100");
            System.out.println("Amount should be less than the Account Balance");
        }
        System.out.println("You current balance is: "+ account_balance);

    }

}
