package atm;

import java.util.Scanner;

public class WithdrawAtm {

	public static void main(String[] args) {
		
		int balance = 100000,withdraw,deposit;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Exit");
			System.out.println("Choose  An Operation you Want");
			
			// get choice from user
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 :
				System.out.println("Enter a Money to Withdraw");
				
				withdraw = sc.nextInt();
				
				
				if (balance>=withdraw) {
					balance = balance-withdraw;
					System.out.println("Please Collect Your Money");
				}else {
					System.out.println("In Sufficient Balance");
				}
				System.out.println();
				break;
			case 2 : 
				System.out.println("Enter a Money to Deposit");
				
				deposit = sc.nextInt();
				
				balance=balance+deposit;
				System.out.println("Your Money has Been Sucessfully Deposited");
				System.out.println();
				break;
				
			case 3 : 
				System.out.println("Balance : "+balance);
				System.out.println();
				
			case 4 : 
				System.exit(0);
			
			}
		}

	}


