package Inheritance_23_10_2025;

class WB
{
	int wb=100;
	
	public void inheritance1() {
		
		System.out.println(wb);
		
	}
	
}

class VC extends WB
{
	int vc=200;
	
	public void inheritance2() {
		
		System.out.println(vc);
	}
	
}

public class Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WB obj=new WB();
		obj.inheritance1();
		
		System.out.println("*************");
		
		VC obj2=new VC();
		obj2.inheritance2();
		
		
		
		
		

	}

}
