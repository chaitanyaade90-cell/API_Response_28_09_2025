package Package_24_04_2026;

class Regression
{
	public void SoftwareTesting() {
		
		System.out.println("My Role is QA");
	}
}

class Smoke extends Regression{
	
	public void SoftwareApplication() {
		
		System.out.println("ADO is a Software develeopment tool");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smoke s1 = new Smoke();
		
		s1.SoftwareTesting();
		s1.SoftwareApplication();

	}

}
