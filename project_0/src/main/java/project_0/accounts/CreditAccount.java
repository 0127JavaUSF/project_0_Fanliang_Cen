package project_0.accounts;

import project_0.baseModels.Account;
import project_0.baseModels.User;


public class CreditAccount extends Account{
	accounttype accounttype = Account.accounttype.CREDIT;
	Double creditlimit = 1000.0;
	Double balance = 0.0;
	
	public CreditAccount(accountownershiptype type, String accountid, String loginid, String loginpassword, User ...users) {
		super(type, loginpassword, loginpassword, loginpassword, users);
	}
	
	
}
