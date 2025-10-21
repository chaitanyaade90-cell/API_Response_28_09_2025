package Inhertitance_Package_21_10_2025;

class DL
{
	
	int dl=100;
	
	public void Inherit1() {
		
		System.out.println(dl);
	}
	
}

class LD extends DL
{
	
	int ld=200;
	
	public void Inherit2() {
		
		System.out.println(ld);
	}
}


public class Inherit_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DL obj=new DL();
		obj.Inherit1();
		
		System.out.println("***************");
		
		LD obj2=new LD();
		obj2.Inherit2();
		
		

	}

}
