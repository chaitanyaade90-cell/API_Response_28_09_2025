package Inheritance_13_10_2025;

class VV
{
	
	int vv=200;
	
	public void inherti1() {
		
		System.out.println(vv);
	}
}

class ZZ extends VV
{
	
	int zz=300;
	
	public void inherit2() {
		
		System.out.println(zz);
	}
}



public class Inheritance_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VV obj=new VV();
		obj.inherti1();
		
		System.out.println("**********");
		
		ZZ obj2=new ZZ();
		obj2.inherit2();

	}

}
