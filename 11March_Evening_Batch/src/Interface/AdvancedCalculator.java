package Interface;

public class AdvancedCalculator implements Calculator,Casio{

	//Implementation class
	@Override
	public void Addition() {
		System.out.println("Addition Method-- Calulator Interface");
	}

	@Override
	public void Substraction() {
		System.out.println("Substraction Method-- Calulator Interface");	
	}

	@Override
	public void Multiplication() {
		System.out.println("Multiplication Method-- Calulator Interface");
	}

	@Override
	public void Log() {
		System.out.println("Log Method-- Casio Interface");	
	}

	@Override
	public void Tan() {
		System.out.println("Tan Method-- Casio Interface");	
	}

	public void Sin() {
		System.out.println("Sin Method-- Advanced Calulator Class");
	}
	
	public void Cos() {
		System.out.println("Cos Method-- Advanced Calulator Class");
	}
}
