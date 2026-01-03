package Ovverride_polimorphism_03_01_2026;

class Bank
{
	public void Rateofintrest() {
		
		System.out.println("General intrest rate");
	}

	public void GeneralRate() {
		// TODO Auto-generated method stub
		
	}

	public void RateofIntrest() {
		// TODO Auto-generated method stub
		
	}
}

class ICICI  extends Bank{
	
	@Override
    
	public void GeneralRate() {
		
		System.out.println("HDFC intrest rate is 7%");
		
	}
	
}

public class Polimorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICI i1 = new ICICI();
		i1.RateofIntrest();
		i1.GeneralRate();

	}

}
