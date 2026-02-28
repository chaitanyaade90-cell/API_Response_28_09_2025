package Overriding_package_28_02_2026;

class Bank
{
	public void Intrest() {
		
		System.out.println("My bankong intrest is 7%");
	}

	public void Dualrate() {
		// TODO Auto-generated method stub
		
	}
	
}

class DividendFund extends Bank{
	
	@Override
	
	public void Dualrate() {
		
		System.out.println("My bank dual rate is 8%");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DividendFund df = new DividendFund();
		
		df.Intrest();
		df.Dualrate();
		

	}

}
