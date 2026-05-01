package Package_01_05_2026;

class AXIS
{
	
	public void Bank() {
		
		System.out.println("My bank gives 7% intrest");
	}
}

class Supreme extends AXIS{
	
	public void Demography() {
		
		System.out.println("My bank name is ICICI");
		
	}
	
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Supreme s = new Supreme();
		
		s.Bank();
		s.Demography();

	}

}
