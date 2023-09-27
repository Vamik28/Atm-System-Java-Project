import java.util.*;
import java.io.IOException;
public class Menu extends Account{
    Scanner menuInput = new Scanner(System.in);
    HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
    
    public  void getLogin() throws IOException{
         int x = 1;
         do {
        	 try {
        		 data.put(123,369);
        		 data.put(124,370);
        		 System.out.println("Welcome to the  Atm Project!");
        		 System.out.println("Enter your customer  Number!");
        		 setCustomerNumber(menuInput.nextInt());
        		 
        		 System.out.print("Enter your Pin Number: ");
        		 setPinNumber(menuInput.nextInt());
        		 
        		 
        		 
        		 
        	 }catch(Exception e) {
        		 System.out.println("\n" + "Invalid Characters(s). Only Numbers." + "\n");
        		 x = 2;
        	 }
        	 int cn = getCustomerNumber();
        	 int pn = getPinNumber();
        	 if(data.containsKey(cn) && data.get(cn) == pn) {
        		 getAccountType();
        	 }
        	 else {
        		 System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
        	 }
         }while(x == 1);
         
    }
    public void getAccountType() {
   	 System.out.println("Select the Account you Want to Access: ");
   	System.out.println("Type 1 - Checking Account ");
   	System.out.println("Type 2 - Saving Account");
   	System.out.println("Type 3 - Exit");
   	
   	 int selection = menuInput.nextInt();
   	 
   	 switch(selection) {
   	   case 1:
   		   getCurrent();
   		   break;
   	   case 2:
 		   getSaving();
 		   break;
   	   default:
		System.out.println("\n" + "Invalid Choice" + "\n" );
		getAccountType();
	
	 
   		 
   	   }
    }
    
    public void getCurrent() {
    	System.out.println("Checking Account: ");
    	System.out.println(" Type 1 - View Balance");
    	System.out.println("Type 2 - Withdraw Balance");
    	System.out.println("Type 3 - Deposit Funds");
    	System.out.println("Type 4 - Exit");
    	System.out.println("Choice ");
    	
    	int selection = menuInput.nextInt();
    	
    	switch(selection) {
    	case 1:
    		System.out.println("Checking Account Balance: " + getCurrentBalance());
    		getAccountType();
    		break;
    	case 2:
    		getCurrentWithdrawInput();
    		getAccountType();
    		break;
    	case 3:
    		getCurrentDepositInput();
    		getAccountType();
    		break;
    	case 4:
    		System.out.println("Thankyou for using this Atm ,bye");
    		break;
    	default:
    		System.out.println("\n" + "Invalid Choice" + "\n" );
    		getCurrent();
    	
    	}
    }
    public void getSaving() {
    	System.out.println("Checking Account: ");
    	System.out.println(" Type 1 - View Balance");
    	System.out.println("Type 2 - Withdraw Balance");
    	System.out.println("Type 3 - Deposit Funds");
    	System.out.println("Type 4 - Exit");
    	System.out.println("Choice ");
    	
    	int selection = menuInput.nextInt();
    	
    	switch(selection) {
    	case 1:
    		System.out.println("Checking Account Balance: " + getSavingBalance());
    		getAccountType();
    		break;
    	case 2:
    		getCurrentWithdrawInput();
    		getAccountType();
    		break;
    	case 3:
    		getSavingDepositInput();
    		getAccountType();
    		break;
    	case 4:
    		System.out.println("Thankyou for using this Atm ,bye");
    		break;
    	default:
    		System.out.println("\n" + "Invalid Choice" + "\n" );
    		getSaving();
    	
    	}
    }
    
}
