package Override_09_01_2026;

class NFR
{
	public void WhiteBoxTesting() {
		
		System.out.println("Selenuim Testing");
	}

	public void BlackBoxTesting() {
		// TODO Auto-generated method stub
		
	}
}

class CrossFunctional extends NFR{
	
	@Override
	
	public void BlackBoxTesting() {
		
		System.out.println("Automation Testing");
	}
		
	}
  

public class Ovveride2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CrossFunctional cr = new CrossFunctional();
		
		cr.WhiteBoxTesting();
		cr.BlackBoxTesting();

	}

}
