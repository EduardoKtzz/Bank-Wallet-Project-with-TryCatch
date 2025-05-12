package main;

import java.util.Scanner;

import model.entities.Account;

public class Program {
	public static void main(String[] args) {
		
		System.out.println();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data: ");

		//Pegar número da conta do cliente
		System.out.print("Number: ");
		Integer number = sc.nextInt();

		//Pegar o nome do titular da conta
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();

		//Pegar o valor do deposito inicial do cliente
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();

		//Pegar o limite de saque do cliente
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		System.out.println();

		//Instancinado os valores para classe
		Account account = new Account(number, holder, balance, withdrawLimit);

		//Perguntando um valor para saque
		System.out.print("Enter amount for withdraw:");
		Double amount = sc.nextDouble();

		try {
			account.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
 
		sc.close();
	}
}
