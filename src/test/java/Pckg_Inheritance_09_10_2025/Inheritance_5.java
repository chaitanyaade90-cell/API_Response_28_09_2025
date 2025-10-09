package Pckg_Inheritance_09_10_2025;


class DD
{
	
	int dd=999;
	
	void inherit() {
		
		System.out.println(dd);
	}
	
}


class EE extends DD

{
	
	int EE=1000;
	
	void inherit2() {
		
		System.out.println(dd);
	}
	
}



public class Inheritance_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DD obj = new DD();
		
		obj.inherit();
		
		System.err.println("*********");
		
		
		EE obj1 = new EE();
		
		obj1.inherit2();

	}

}
