package Interface;

public class Test {

	public static void main(String[] args) {
//		RBIBank RB = new RBIBank(); Object of interface can not be created.
//		USBank UB = new USBank();
//		BrazilBank BB = new BrazilBank();
		
		HSBCBank HB1 = new HSBCBank();
		HB1.Creditcard();
		HB1.DebitCard();
		HB1.TransferMoney();
		HB1.BikeLoan();
		HB1.PersonalLoan();
		HB1.MutualFunds();
		HB1.CarLoan();
		HB1.HomeLoan();
		HB1.GoldLoan();
		System.out.println(HSBCBank.MinBalance);
		
		System.out.println();
		RBIBank RB = new HSBCBank(); //RTP/Dynamic binding
		RB.Creditcard();
		RB.DebitCard();
		RB.TransferMoney();
		
		System.out.println();
		USBank UB = new HSBCBank();
		UB.BikeLoan();
		UB.PersonalLoan();
		
		System.out.println();
		BrazilBank BB = new HSBCBank();
		BB.CarLoan();
		BB.MutualFunds();
	}

}
