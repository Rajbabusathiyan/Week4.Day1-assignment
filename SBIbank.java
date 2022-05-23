package week4;

public class SBIbank extends SBI{

	public void Bankbalence() {
		System.out.println("Bankbalence");
	
	}

	
	public void MaximumLoanAmount() {
		System.out.println("MaximumLoanAmount");
	
	}
	public static void main(String[] args) {
		SBIbank bank=new SBIbank();
		bank.Bankbalence();
		bank.MaximumLoanAmount();
		bank.ITloan();
		
		
	}
	
	

}
