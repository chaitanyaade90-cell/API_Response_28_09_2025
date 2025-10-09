package Pckg_Inheritance_09_10_2025;


class CC
{
	
	int cc=5000;
	
	void inherit() {
		
		System.out.println(cc);
	}
}

class DD extends CC
{
	int dd=6000;
	
	void inheri2() {
		
		System.out.println(dd);
	}
	
	
	
}




public class Inheritance_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CC obj=new CC();
		
		obj.inherit();
		
		System.out.println("************");
		
		
		DD obj1=new DD();
		
		obj1.inheri2();
		
		
		
		
		

	}

}
