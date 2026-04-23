package Inheritance_Package_23_04_2026;

class publicCompany

{
    public void Severity() {
    	
    	System.out.println("My Company is Coforge");
    }	
	
}

class PrivateCompany extends publicCompany{
	
	public void Priority() {
		
		System.out.println("India is biggest Manafacture company");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateCompany p1 = new PrivateCompany();
		
		p1.Severity();
		p1.Priority();

	}

}
