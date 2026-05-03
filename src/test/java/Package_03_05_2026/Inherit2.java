package Package_03_05_2026;

class Study
{
	public void RestAssured() {
		
		System.out.println("My role is PTM");
	}
}

class Degree extends Study{
	
	public void College() {
		
		System.out.println("My degree is Bcom");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Degree d = new Degree();
		
		d.RestAssured();
		d.College();

	}

}
