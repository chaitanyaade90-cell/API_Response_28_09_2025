package Inheritance_13_10_2025;

class AA
{
	
	int aa=200;
	
	
	public void inheritance1() {
		
		System.out.println(aa);
	}
	
}

class BB extends AA
{
	int bb=300;
	
	
	public void inheritance2() {
		
		System.out.println(bb);
		
	}

		
		
	}


public class Inheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA obj=new AA();
		obj.inheritance1();
		
		System.out.println("***********");
		
		BB obj1=new BB();
		obj1.inheritance2();

	}
	
	

}
