package Package_27_04_2026;

class ADO
{
	public void Bank() {
		
		System.out.println("My Bank name is SBI");
	}
	
}

class AgileMethodology extends ADO{
	
	public void IT() {
		
		System.out.println("My Job role is TE");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgileMethodology a1 = new AgileMethodology();
		
		a1.Bank();
		a1.IT();

	}

}
