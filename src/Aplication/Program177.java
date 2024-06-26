package Aplication;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import model.Entidades.Account;
import model.Exceptions.DomainExceptions;

public class Program177 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.printf("Initial Balance: ");
			double balance =  sc.nextDouble();
			System.out.printf("Withdraw Limit: ");
			double withdrawLimit =  sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			
			account.withdraw(amount);
			System.out.printf("New balance: %.2f%n", + account.getBalance());;
			}
			catch(DomainExceptions e){
				System.out.println("Withdraw error: " + e.getMessage());
			}
			catch (RuntimeException e) {
				System.out.println("Invalid Format");
			}
		
		sc.close();
	}

}
