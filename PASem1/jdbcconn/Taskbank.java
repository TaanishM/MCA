package jdbcconn;

import java.util.Scanner;

class BankDetails{
	String bankName = new String();
	String accHolderName = new String();
	long accNumber;
	public void setBankName(String name) {
		bankName = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setaccHolderName(String accname) {
		accHolderName = accname;
	}
	public String getAccname() {
		return accHolderName;
	}
	public void setaccnum(long num) {
		accNumber = num;
	}
	public long getaccnum() {
		return accNumber;
	}
}

interface CreditCard
{
	void giveBankDetails();
	String getCreditCard();
}

class BankCustomer extends BankDetails implements CreditCard{
	String Cred = new String();
	public void giveBankDetails()
	{
		System.out.printf("Bank Name: "+this.getBankName()+"\n");
		System.out.printf("Account Holder Name: "+this.getAccname()+"\n");
		System.out.printf("Account Number: "+this.getaccnum()+"\n");
	}
	public String getCreditCard(){
		switch(bankName) {
			case "HDFC": Cred= "Approved";
				break;
			case "SBI": Cred= "Approved";
				break;
			case "ICICI": Cred = "Approved";
				break;
			default: Cred="Not Approved";}
		return Cred;
		}
}

public class Taskbank {
	public static void main(String []args) {
		BankCustomer b1 = new BankCustomer();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number");
		long accnum=sc.nextLong();
		b1.setaccnum(accnum);
		
		System.out.println("Enter Account Holder Name");
		String aname = sc.next();
		b1.setaccHolderName(aname);
		
		System.out.println("Enter Bank Name");
		String bname = sc.next();
		b1.setBankName(bname);
		
		String approv = new String();
		b1.giveBankDetails();
		approv=b1.getCreditCard();
		System.out.printf("Credit Card status: "+approv);
		
		sc.close();
}
}
