package oops.Abstraction;

public class BankerUser {
public static void main(String[]args) {
	RBI bank1=null;
	String bankName="HDFC";
	if(bankName.equals("SBI"))
	{
		bank1=new SBI();
	}else if(bankName.equals("HDFC"))
	{
		bank1=new HDFC();
	}else if(bankName.equals("ICICI"))
	{
		bank1=new ICICI();
	}
	bank1.creditCard();
	bank1.currentAccount();
	bank1.savingAccount();
	bank1.debitCard();
}
}
