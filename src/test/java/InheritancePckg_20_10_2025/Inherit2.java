package InheritancePckg_20_10_2025;

class TL
{
	
	String tl= "Access";
	
	public void Inherit1() {
		
		System.out.println(tl);
		
		
	}
}

class KL extends TL
{
	String kl= "Accept";
	
	public void Inherit2() {
		
		System.out.println(kl);
		
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TL obj1=new TL();
		obj1.Inherit1();
		
		System.out.println("***********");
		
		KL obj2=new KL();
		obj2.Inherit2();
		
		

	}

}
