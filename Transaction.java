package Unit11;

import java.util.Date;

public class Transaction {

	private Date date=new Date();
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(char newType,double newAmount,double newB,String newDe) {
		type=newType;
		amount=newAmount;
		balance=newB;
		description=newDe;
	}
	public char getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription() {
		return description;
	}
	public Date getDate() {
		return date;
	}
	public void setType(char newT) {
		type=newT;
	}
	public void setAmount(double newAmount) {
		amount=newAmount;
	}
	public void setBalance(double newB) {
		balance=newB;
	}
	public void setDescription(String newDe) {
		description=newDe;
	}
	
}

