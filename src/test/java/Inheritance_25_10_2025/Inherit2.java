package Inheritance_25_10_2025;

class AL
{
	int al=300;
	
	public void inheri1() {
		
		System.out.println(al);
	}
	
}

class LA extends AL
{
	int la=200;
	
	public void inherti2() {
		
		System.out.println(la);
	}
	
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AL obj=new AL();
		obj.inheri1();
		
		System.out.println("***********");
		
		LA obj2=new LA();
		obj2.inherti2();
		
		

	}

}
