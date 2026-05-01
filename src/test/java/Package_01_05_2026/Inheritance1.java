package Package_01_05_2026;

class ATS
{
	public void Demo() {
		
		System.out.println("Demo was good");
	}
}

class SIT extends ATS{
	
	public void Memo() {
		
		System.out.println("Memo is Deligate");
	}
}


public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SIT s = new SIT();
		
		s.Demo();
		s.Memo();

	}

}
