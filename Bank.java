package week4;

public class Bank implements CIBILmethod,PNB{

	public void MaximumLoanAmount() {
	System.out.println("MaximumLoanAmount");
	}

	public void CreditScore() {
	System.out.println("CreditScore");
	}

	public void MinimumBalance() {
	System.out.println("MinimumBalance");
	}

	public void CibilScore() {
		System.out.println("CibilScore");
	}
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.MaximumLoanAmount();
		obj.MinimumBalance();
		obj.CibilScore();
		obj.CreditScore();
	}
	
}

