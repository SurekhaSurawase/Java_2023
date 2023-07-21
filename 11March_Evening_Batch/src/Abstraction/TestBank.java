package Abstraction;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank HB = new HDFCBank();
		HB.CreditCard();
		HB.DebitCard();
		HB.Loan();
		HB.PersonalLoan();
		System.out.println();
		
		//RBIBank RB = new RBIBank(); not allowed as abstract class
		
		RBIBank RB = new HDFCBank(); //object creation of child class with reference to parent class. Dynamic binding
		RB.Loan();
		RB.CreditCard();
		RB.DebitCard();
		// RB.PersonalLoan();not applicable as method is present in child class
		
		//HDFCBank HB = new RBIBank(); down casting not allowed
	}

}
