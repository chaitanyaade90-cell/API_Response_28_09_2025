package Inheritance_01_01_2026;

class Bank
{
	public void Deposit() {
		
		System.out.println("Bank give 5% Divident fund");
	}
}

class Intrest extends Bank{
	
	public void Saving() {
		
		System.out.println("Current Account");
	}
}

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intrest i1 = new Intrest();
		
		i1.Deposit();
		i1.Saving();

	}

	private static void Intrest() {
		// TODO Auto-generated method stub
		
	}

}
