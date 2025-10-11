package Inheritance_Pckg_11_10_2025;

class BA
{
	
	int ba=100;
	
	public void inheritance() {
		
		System.out.println(ba);
	}
	
}

class CA extends BA

{
	
	int ca=200;
	
	public void inheritance1() {
		
		System.out.println(ca);
	}
	
}


public class Class_Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BA obj=new BA();
		obj.inheritance();
		
		System.out.println("********");
		
		CA obj1=new CA();
		
		obj1.inheritance1();
		

	}

}
