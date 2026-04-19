package Inheritance_19_04_2026;

class Bank
{
	
	public void SoftwareDev() {
		
		System.out.println("My Bank intrest is 7%");
	}
}

class GDP extends Bank{
	
	public void HardwareProg() {
		
		System.out.println("My Hardware programme is GooglePay");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GDP g1 = new GDP();
		
		g1.SoftwareDev();
		g1.HardwareProg();

	}

}
