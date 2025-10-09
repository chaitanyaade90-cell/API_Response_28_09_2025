package Pckg_Inheritance_09_10_2025;

class AA
{

	int aa=2000;
	
	void inherit() {
		
		System.out.println(aa);
	}
	
}

class BB extends AA
{
	
	int bb=3000;
	
	void inherit2() {
		
		System.out.println(bb);
	}
}





public class Inheritance_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA obj=new AA();
		obj.inherit();		
		
		System.out.println("**********");
		
		BB obj1=new BB();
		obj1.inherit2();
		
		
		
				

	}

}
