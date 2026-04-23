package Inheritance_Package_23_04_2026;

class Bank
{
	public void Loan() {
		
		System.out.println("Loan percentage is 7%");
	}
}

class Factory extends Bank{
	
	public void HomeLoan() {
		
		System.out.println("Dividend rate is 25 %");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory f1 = new Factory();
		
		f1.Loan();
		f1.HomeLoan();

	}

}
