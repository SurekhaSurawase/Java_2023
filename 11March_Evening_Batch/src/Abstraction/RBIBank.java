package Abstraction;

public abstract class RBIBank {

	public void Loan() {
		System.out.println("RBI --- loan");
	}
	
	public abstract void DebitCard();
	
	public abstract void CreditCard();

}
