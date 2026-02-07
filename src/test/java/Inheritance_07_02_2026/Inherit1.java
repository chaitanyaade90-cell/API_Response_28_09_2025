package Inheritance_07_02_2026;

class Bank
{
	
	public void Deposit() {
		
		System.out.println("Bank divedent 7%");
	}
	
}

class Tax extends Bank{
	
	public void saving() {
		
		System.out.println("Tax is 12%");
	}
}

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tax t1 = new Tax();
		
		t1.Deposit();
		t1.saving();

	}

}
