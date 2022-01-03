package Unit11;

import java.util.ArrayList;
import java.util.Date;

public class NewAccount {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated=new Date();
	private String name;
	private ArrayList transaction=new ArrayList();
	public NewAccount(){
	}
	public NewAccount(int newId,double newB) {
		id=newId;
		balance=newB;
	}
	public NewAccount(String newName,int newId,double newB) {
		name=newName;
		id=newId;
		balance=newB;
	}
	
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public String getName() {
		return name;
	}
	public void setId(int newId) {
		id=newId;
	}
	public void setBalance(double newB) {
		balance=newB;
	}
	public void setAnnualInterestRate(double newA) {
		annualInterestRate=newA;
	}
	public Date dateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12.0;
	}
	public double getMonthlyInterest() {
		return balance*annualInterestRate/1200.0;
	}
	public void withDraw(double draw) {
		balance-=draw;
		transaction.add(new Transaction('W',draw,balance,"È¡¿î"));
	}
	public void deposit(double draw) {
		balance+=draw;
		transaction.add(new Transaction('D',draw,balance,"´æ¿î"));
	}
	public void printAllTransaction() {
		for(int i=0;i<transaction.size();i++) {
			Transaction newT=(Transaction) transaction.get(i);
			System.out.println("date: "+newT.getDate()+" type: "+newT.getType()+" amount: "+newT.getAmount()+" balance: "+newT.getBalance()+" desctiption: "+newT.getDescription());
		}
	}
}

