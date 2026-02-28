package Inheritance_28_02_2026;

class M1
{
	public void Account() {
		
		System.out.println("My role is QE");
	}
	
}

class M2 extends M1{
	
	public void Banking() {
		
		System.out.println("My Banking name is SBI");
		
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M2 m = new M2();
		
		m.Account();
		m.Banking();

	}

}
