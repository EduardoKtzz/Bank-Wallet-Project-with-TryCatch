package model.entities;

public class Account {

	//Atributos
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	//Construtores
	public Account() { 

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	//Getters e setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	//Métados
	//Métado para deposito de valores na conta do cliente
	public void deposit(Double amount) {
   	 	this.balance += amount;
   		System.out.println("New balance after deposit: " + String.format("%.2f", getBalance()));
	}

	//Métado para saque de valor da carteira do cliente
	public void withdraw(Double amount) {

		if (amount > getWithdrawLimit()) {
			throw new IllegalArgumentException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > getBalance()) {
			throw new IllegalArgumentException("Withdraw error: Not enough balance.");
		}
		this.balance -= amount;
	}	

	@Override
	public String toString() {
		return "Account [number=" + number +
			", holder=" + holder +
			", balance=" + String.format("%.2f", balance) +
			", withdrawLimit=" + String.format("%.2f", withdrawLimit) + "]";
	}
}