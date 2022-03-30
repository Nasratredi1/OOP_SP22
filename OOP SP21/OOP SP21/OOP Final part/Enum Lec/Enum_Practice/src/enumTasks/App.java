package enumTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("1.KARACHI\n2.LAHORE\n3.ISLAMABAD\n4.QUETTA\n5.PESHAWAR");
		while(true)
		{
			Scanner in = new Scanner(System.in);
			System.out.print("\nEnter City Number: ");
			try
			{
				int cityNum = in.nextInt();
				if(cityNum==0)
					throw new InputMismatchException();
				
				Cities city = Cities.values()[cityNum - 1];
				System.out.println("\nCity Name: " + city.getCityName());
				System.out.println("Longitude: " + city.getLongitude());
				System.out.println("Lattitude: " + city.getLattitude());
				break;
				
			}
			catch(ArrayIndexOutOfBoundsException | InputMismatchException exp)
			{
				if(exp instanceof InputMismatchException)
				{
					System.out.println("Please enter valid number");
				}
				else if(exp instanceof ArrayIndexOutOfBoundsException)
				{
					System.out.println("The list contain only 5 Cities");
				}
			}
	}
	}
		

}
