package Ovveride_01_01_2026;

class Testing
{
	public void ADO() {
		
		System.out.println("My role is QE");
	}

	public void Technical() {
		// TODO Auto-generated method stub
		
	}
}

class Software extends Testing{
	
	@Override
	
	public void Technical() {
		
		System.out.println("My Project is ATR");
		
	}
}

public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Software s1 = new Software();
		
		s1.ADO();
		s1.Technical();
		
		

	}

}
