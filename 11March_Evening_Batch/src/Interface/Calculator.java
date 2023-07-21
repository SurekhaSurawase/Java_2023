package Interface;

public interface Calculator {

	//Interface is a mechanism to achieve absrtaction.
	//Interface contains only abstract methods i.e.methods having declarations only.
	//Variables delared inside the interface are by default static and final.
	//Methods declared inside interface are by default public and abstract
	//With the help of interface we can achieve 100% abstraction.
	//Constructor concept is not applicable for interface
	//We can not create object of interface.
	//Implementation Class: the class provides the definitions of abstract methods in interface with the help of implements keyword is called implementation class.
	
	void Addition();
	void Substraction();
	void Multiplication();
	
	
}
