package Insheritance_10_02_2026;

class BA
{
	
	int BA = 200;
	
	public void Developer() {
		
		System.out.println(BA);
	}
}

class TE extends BA{
	
	int TE =400;
	
	public void Tester() {
		
		System.out.println(TE);
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BA obj = new BA();
		
		obj.Developer();
		
		System.out.println("************");
		
		TE obj1 = new TE();
		obj1.Tester();
		

	}

}
