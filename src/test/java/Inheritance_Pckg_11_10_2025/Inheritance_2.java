package Inheritance_Pckg_11_10_2025;

class AC
{
	
	int ac=3000;
	
	public void inherit() {
		
		System.out.println(ac);
	}
}

class BC
{
	
	int bc=2000;
	
	public void inherit1() {
		
		System.out.println(bc);
	}
}

public class Inheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AC obj=new AC();
		obj.inherit();
		
		System.out.println("******");
		
		BC obj1=new BC();
		obj1.inherit1();
				

	}

}
