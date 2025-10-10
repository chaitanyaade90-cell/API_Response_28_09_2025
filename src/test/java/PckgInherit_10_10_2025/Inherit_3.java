package PckgInherit_10_10_2025;

class L
{
	
	int l=900;
	
	void inherit() {
		
		System.out.println(l);
	}
}

class N extends L

{
	
	int n=100;
	
	void inherit1() {
		
		System.out.println(n);
	}
}

public class Inherit_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		L obj=new L();
		
		obj.inherit();
		
		System.out.println("********");
		
		N obj1=new N();
		
		obj1.inherit1();
		

	}

}
