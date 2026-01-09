package Inheritance_09_01_2026;

class Bank
{
	public void Intrest() {
		
		System.out.println("Bank rate is 7%");
	}
	
}

class DividentFund extends Bank{
	
	public void Savings() {
		
		System.out.println("Banking saving");
	}
}

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DividentFund df = new DividentFund();
		
		df.Intrest();
		df.Savings();
		
		

	}

}
