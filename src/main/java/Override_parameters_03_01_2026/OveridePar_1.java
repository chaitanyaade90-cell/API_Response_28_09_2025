package Override_parameters_03_01_2026;

class Bank
{
	public void intrest(int rate) {
		System.out.println("Intrest rate: " + rate);
		
	}
}

class SBI extends Bank {
	
	@Override
	
	public void intrest(int rate) {
		
		System.out.println("SBI Intrest rate: " + rate);
	}

	public void saving() {
		// TODO Auto-generated method stub
		
	}
}

public class OveridePar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI s1 = new SBI();
		s1.intrest(5);
		s1.saving();

	}

}
