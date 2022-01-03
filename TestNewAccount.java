package Unit11;

public class TestNewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewAccount account=new NewAccount("George",1122,1000);
		account.setAnnualInterestRate(1.5);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withDraw(5);
		account.withDraw(4);
		account.withDraw(2);
		System.out.println("账户清单如下");
		System.out.println("name: "+account.getName()+" annualInterestRate: "+account.getAnnualInterestRate()+" balance: "+account.getBalance());
		account.printAllTransaction();
	}

}

