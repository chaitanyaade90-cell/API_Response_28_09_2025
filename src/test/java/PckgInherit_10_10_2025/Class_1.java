package PckgInherit_10_10_2025;

class O
{
	
	int o=300;
	
	void inherit() {
		
		System.out.println(o);
	}
}

class P extends O
{
	
	int p=500;
	
	void inherit2() {
		
		System.out.println(p);
	}
}

public class Class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		O obj = new O();
		
		obj.inherit();
		
		System.out.println("************");
		
		P obP=new P();
		
		obP.inherit2();

	}

}
