package Abstraction;

public class HDFCBank extends RBIBank {

	@Override
	public void DebitCard() {
		System.out.println("HDFC -- DebitCard");
		
	}

	@Override
	public void CreditCard() {
		System.out.println("HDFC -- CreditCard");		
	}
	
	public void PersonalLoan() {
		System.out.println("HDFC--- Personal loan");
	}
}
