import java.util.*;

public class Account {
     private int customerNumber;
     private int  pinNumber; 	
     private double CurrentBalance = 0;
     private double SavingBalance = 0;
     
     Scanner input = new Scanner(System.in);
     
     public int setCustomerNumber(int customerNumber) {
    	 this.customerNumber = customerNumber;	
    	 return customerNumber;
     }
     public int getCustomerNumber() {
    	 return customerNumber;
     }
     public int setPinNumber(int pinNumber) {
         this.pinNumber = pinNumber;
         return pinNumber;
     }
     public int getPinNumber() {
    	 return pinNumber;
     }
     public double getCurrentBalance() {
    	 return CurrentBalance;
     }
     public double getSavingBalance() {
    	 return SavingBalance;
     }
     public double CurrentWithdraw(double Amount) {
    	 CurrentBalance  = CurrentBalance - Amount;
    	 return CurrentBalance;
     }
     public double SavingWithdraw(double Amount) {
    	 SavingBalance  = SavingBalance - Amount;
    	 return SavingBalance;
     }
     public double CurrentDeposit(double Amount) {
    	 CurrentBalance  = CurrentBalance + Amount;
    	 return CurrentBalance;
     }
     public double SavingDeposit(double Amount) {
    	 SavingBalance  = SavingBalance + Amount;
    	 return SavingBalance;
     }
      public void getCurrentWithdrawInput() {
    	System.out.println("Current Account Balance: " + CurrentBalance);
    	System.out.println("Enter Amount You Want to Withdraw: " );
    	double amount = input.nextDouble();
    	if((CurrentBalance - amount) >= 0) {
    		CurrentWithdraw(amount);
    		System.out.println("New Current Account Balance: " + CurrentBalance);
    	}
    	else {
    		System.out.println("No Suffiecient Balance To Make the Transaction: " + "\n");
    	}
     }
     public void getSavingWithdrawInput() {
     	System.out.println("Saving Account Balance: " + SavingBalance);
     	System.out.println("Enter Amount You Want to Withdraw: " );
     	double amount = input.nextDouble();
     	if((SavingBalance - amount) >= 0) {
     		SavingWithdraw(amount);
     		System.out.println("New Current Account Balance: " + SavingBalance);
     	}
     	else {
     		System.out.println("No Suffiecient Balance To Make the Transaction: " + "\n");
     	}
      }
     public void getCurrentDepositInput() {
     	System.out.println("Current Account Balance: " + CurrentBalance);
     	System.out.println("Enter Amount You Want to Deposit: " );
     	double amount = input.nextDouble();
     	if((CurrentBalance + amount) >= 0) {
     		CurrentDeposit(amount);
     		System.out.println("New Current Account Balance: " + CurrentBalance);
     	}
     	else {
     		System.out.println("No Suffiecient Balance To Make the Transaction: " + "\n");
     	}
      }
     public void getSavingDepositInput() {
      	System.out.println("Saving Account Balance: " + SavingBalance);
      	System.out.println("Enter Amount You Want to Deposit: " );
      	double amount = input.nextDouble();
      	if((SavingBalance + amount) >= 0) {
      		SavingDeposit(amount);
      		System.out.println("New Saving Account Balance: " + SavingBalance);
      	}
      	else {
      		System.out.println("No Suffiecient Balance To Make the Transaction: " + "\n");
      	}
       }
     
     
}
