package Override_Package_23_04_2026;

class Bank
{
	public void Loan() {
		
		System.out.println("My bank provide loan");
	}

	public void Manafacture() {
		// TODO Auto-generated method stub
		
	}
}

class Factory extends Bank{
	
	@Override
	
	public void Manafacture() {
		
		System.out.println("My factory import software");
	}
}

public class Override_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory f1 = new Factory ();
		
		f1.Loan();
		f1.Manafacture();

	}

}
