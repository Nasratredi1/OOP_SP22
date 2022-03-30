package exceptionss;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		//every software build by developers have some specific flow 
		//abnormal flow 
		//events -- something on which software needs to perform some action
		//1. button click, mouse click
		//2. method call
		//to handle abnormal flows, we use (try, catch) to handle exceptions
		//be default, Java provides try, catch structure
		
		Scanner scanner = new Scanner(System.in);
		
		BankAccount bac = new BankAccount();
		
		//compiler has no issues, correct compiling and running but, 
		//as a developer, there may be an exception 
		//unchecked exceptions - runtime exceptions
		
		//System.out.println(bac.getWithdrawAmount());
		
		try {
			System.out.println("Enter the amount to deposit : ");
			bac.setWithdrawAmount(scanner.nextInt());
			System.out.println("Enter the amount to transfer : ");
			bac.setTransferAmount(scanner.nextInt());
			//in case of exception, it is java that is passing that exception information to catch block
			//in case of abnormal event, exception information is carried in an object of type exception
		}catch(InputMismatchException | IllegalArgumentException e) {
			System.out.println("Please provide valid input. " );
		}finally {
			System.out.println("I run anyway.");
		}
			
		//System.out.println(bac.getTransferAmount());
				
	}

}
