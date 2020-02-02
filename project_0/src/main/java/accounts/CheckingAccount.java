package accounts;

import bankservices.*;

import project_0.pojo.Account;
import project_0.pojo.User;


public class CheckingAccount extends Account implements CanWithdraw, CanTransfer{
	 accounttype accounttype = Account.accounttype.CHECKING;
	 Double creditlimit = 0.0;
	 Double balance = 0.0;
	 
	 public CheckingAccount(accountownershiptype type, String accountid, String loginid, String loginpassword, User ...users) {
		 super(type, loginpassword, loginpassword, loginpassword, users);
	 }

	 
	 //the withdraw service
	 public void Withdraw(Double amount) {
		 if(this.balance >= amount) {
			 this.balance -= amount;
			 System.out.println("Your withdrawl of $"+ amount +" is complete. ");
			 System.out.println("Your remaining balance is "+this.balance);
		 }
		 else {
			 System.out.println("Insufficient account balance...");
		 }
		 
	 }
	 
	 //the transfer service
	 public void Transfer(Account accountid, Double amount) {
		 
			 if(this.balance >= amount) {
				 this.balance -= amount;
				 accountid.setBalance(accountid.getBalance()+amount);
			 }
			 else {
				 System.out.println("Insufficient account balance...");
			 }
		 }
	
	 
	 
}
