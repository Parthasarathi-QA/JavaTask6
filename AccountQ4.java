package task6Package;

import java.util.Scanner;

public class AccountQ4 {

	private String accNum;
	private String accountHolderName;
	private String accountType;
	private double balance;
	private int pin;
	private String branchName;
	private boolean isActive;

	// Scanner for input
	static Scanner obj = new Scanner(System.in);

	// No-argument constructor
	public AccountQ4() {
		this.accNum = "0000000000";
		this.pin = 0000;
		this.balance = 0.0;
		this.accountHolderName = "Default";
		this.accountType = "Savings";
		this.branchName = "Main";
		this.isActive = true;
	}

	// Two-argument constructor
	public AccountQ4(String accNum, int pin) {
		this.accNum = accNum;
		this.pin = pin;
		this.balance = 1000.0; // default balance
		this.accountType = "Savings";
		this.isActive = true;
	}

	// Deposit method
	public void depositAmount(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount deposited successfully.");
		} else {
			System.out.println("Invalid amount.");
		}
	}

	// Withdraw method
	public void withdrawAmount(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	// Check balance method
	public void checkBalance(String inputAccNum, int inputPin) {
		if (this.accNum.equals(inputAccNum) && this.pin == inputPin) {
			System.out.println("Balance in your account: " + balance);
		} else {
			System.out.println("Invalid account number or PIN.");
		}
	}

	// Main method
	public static void main(String[] args) {
		System.out.print("Enter the account number: ");
		String userInputACN = obj.nextLine();

		System.out.print("Enter the PIN: ");
		int userPIN = obj.nextInt();
		obj.nextLine(); // Clear newline left by nextInt()

		// Create account object
		AccountQ4 acc = new AccountQ4(userInputACN, userPIN);

		System.out.print("Enter the option (Withdraw Amount / Deposit Amount / Check Balance): ");
		String userOption = obj.nextLine();

		if (userOption.equalsIgnoreCase("Withdraw Amount")) {
			//Withdraw Amount
			System.out.print("Enter amount to withdraw: ");
			double withdrawAmount = obj.nextDouble();
			acc.withdrawAmount(withdrawAmount);
			
			//Balance Check
			acc.checkBalance(userInputACN, userPIN);

			//Deposit amount
			System.out.print("Enter amount to deposit: ");
			double depositAmount = obj.nextDouble();
			acc.depositAmount(depositAmount);
			
			//Balance Check
			acc.checkBalance(userInputACN, userPIN);

			//Withdraw Amount
			System.out.print("Enter amount to withdraw: ");
			double withdrawAmount1 = obj.nextDouble();
			acc.withdrawAmount(withdrawAmount);
			
			//Balance Check
			acc.checkBalance(userInputACN, userPIN);

		} else if (userOption.equalsIgnoreCase("Deposit Amount")) {
			//Deposit amount
			System.out.print("Enter amount to deposit: ");
			double depositAmount = obj.nextDouble();
			acc.depositAmount(depositAmount);
			
			//Balance Check
			acc.checkBalance(userInputACN, userPIN);

		} else if (userOption.equalsIgnoreCase("Check Balance")) {
			//Balance Check
			acc.checkBalance(userInputACN, userPIN);

			//Deposit amount
			System.out.print("Enter amount to deposit: ");
			double depositAmount = obj.nextDouble();
			acc.depositAmount(depositAmount);

			//Balance Check
			acc.checkBalance(userInputACN, userPIN);

			//Withdraw Amount
			System.out.print("Enter amount to withdraw: ");
			double withdrawAmount = obj.nextDouble();
			acc.withdrawAmount(withdrawAmount);

			//Balance Check
			acc.checkBalance(userInputACN, userPIN);

		} else {
			System.out.println("Enter a correct option.");
		}

		obj.close();
	}

}
