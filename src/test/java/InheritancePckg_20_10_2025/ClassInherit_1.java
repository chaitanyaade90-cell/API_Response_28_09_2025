package InheritancePckg_20_10_2025;

class WZ
{
	
	int wz=200;
	
	public void Inheritance1() {
		
		System.out.println(wz);
	}
}

class ZW  extends WZ
{
	
	int zw=100;
	
	public void Inheritance2() {
		
		System.out.println(zw);
	}
}

public class ClassInherit_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WZ obj1=new WZ();
		obj1.Inheritance1();
		
		System.out.println("*******");
		
		ZW obj2=new ZW();
		obj2.Inheritance2();

	}

}
