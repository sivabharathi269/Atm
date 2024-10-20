package octanet;
import java.util.*;
public class Atm {
	private int balance;
	private int pin;
	public Atm(int balance,int pin) {
		this.balance=balance;
		this.pin=pin;
		}
	public void displayMenu() {
		System.out.println("1.checking the Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		
	System.out.println("4.change Pin");
		System.out.println("5.exit"); 
		
	}
public void deposit(int amount) {
	
		balance+=amount;
		System.out.println("Amount"+" "+amount+" "+"deposited");
	}
public void withdraw(int amount) {
	
	if(balance<amount) {
		System.out.println("Insufficient balance");
	
	}
	else {
		balance-=amount;
		System.out.println("Amount"+" "+amount+" "+"withdrawed");
	}
	
}

public void getbalance() {
		System.out.println("Balance Amount : " +balance);
		
	}
public Boolean valpin(int pin) {
	 return this.pin==pin;
}
public void changepin(int newpin) {
	pin=newpin;
}
public static void main(String args[]) {
	Atm atm=new Atm(5000,1234);
	
	System.out.println("enter the pin");
	Scanner sc=new Scanner(System.in);
	int Enteredpin =sc.nextInt();	
	if(atm.valpin(Enteredpin)) {
		int option=0;
		while(option!=5) {
			System.out.println("-------------------------------------------------------------------");
			atm.displayMenu();
			System.out.println("Enter your option");
			option=sc.nextInt();
			switch(option) {
			case 1:
				atm.getbalance();
				break;
			case 2:
				System.out.println("enter the amount");
				int amount=sc.nextInt();
				
				atm.deposit(amount);
				break;
			case 3:
				System.out.println("enter the amount");
				amount=sc.nextInt();
				atm.withdraw(amount);
				break;
			case 4:
				System.out.println("enter the new pin");
				int newpin=sc.nextInt();
				atm.changepin(newpin);

				break;
			default :
			 System.out.println("invalid choice");
				
			
		}
			
	}
}
	else {
		System.out.println("Invalid  pin");
	}
	
}

}
