package Interface;

public class HSBCBank implements RBIBank, USBank, BrazilBank{

	@Override
	public void Creditcard() {
		System.out.println("HSBC Bank--- Creditcard");
		
	}

	@Override
	public void DebitCard() {
		System.out.println("HSBC Bank--- DebitCard");
		
	}

	@Override
	public void TransferMoney() {
		System.out.println("HSBC Bank--- TransferMoney");
		
	}

	@Override
	public void BikeLoan() {
		System.out.println("HSBC Bank--- Bike loan");
		
	}

	@Override
	public void PersonalLoan() {
		System.out.println("HSBC Bank--- Personal Loan");
		
	}

	@Override
	public void CarLoan() {
		System.out.println("HSBC Bank--- Car loan");
		
	}

	@Override
	public void MutualFunds() {
		System.out.println("HSBC Bank--- Mutual Funds");
	}
	
	public void HomeLoan() {
		System.out.println("HSBC Bank--- Home loan");
	}
	
	public void GoldLoan() {
		System.out.println("HSBC Bank--- Goldloan");
	}

}
