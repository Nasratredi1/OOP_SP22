package Task_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bankaccount = new BankAccount();


        System.out.println("Enter the Account holder name : ");
        String accountName = input.nextLine();
        bankaccount.setName(accountName);


        System.out.println("Enter the balance in your account: ");
        double initialBalance = input.nextDouble();
        bankaccount.setBalance(initialBalance);


        int menuOption = 0 ;

        do {

            System.out.println();
            System.out.println("1) To Deposit an amount: ");
            System.out.println("2) To Withdraw an amount: ");
            System.out.println("3) To View the current balance: ");
            System.out.println("4) To close this program: ");
            menuOption = input.nextInt();

            switch (menuOption){
                case 1:
                    System.out.println("Enter the amount you want to deposit in your account: ");
                    //bankaccount.deposit(input.nextDouble());
                    bankaccount.deposit(getAmount());
                    break;
                case 2:
                    if (bankaccount.getBalance() < 50000){
                        System.out.println("As you sure you want to withdraw, it would make your balance below 50,000. Press 1 to continue and 0 to abort");
                        if (input.nextInt() == 0) continue;
                    } else
                    System.out.println("Enter the amount you want to withdraw: ");
                    bankaccount.withdraw(input.nextDouble());
                    break;

                case 3:
                    System.out.println("Your balance is = " + bankaccount.getBalance());
            }

        }while (menuOption !=4);
        System.out.println("Account Title: "+ bankaccount.getName());
        System.out.println("Total deposits: " + bankaccount.getDepositCount());
        System.out.println("Total withdraws: " + bankaccount.getWithdrawsCount());
        System.out.println("Balance: "+ bankaccount.getBalance());


    }
    public static double getAmount(){
          Scanner input = new Scanner(System.in);
            System.out.println("Enter the amount:  > ");
            double amount = input.nextDouble();
            return amount;
        }
}
