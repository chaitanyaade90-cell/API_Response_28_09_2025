package Oops_pckg_09_10_2025;

public class OopsClass_1 {
	
	int slno;
	String name;
	int salary;
	
	void Display() 
	{
		
		System.out.println(slno);
		System.out.println(name);
		System.out.println(salary);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OopsClass_1 oc=new OopsClass_1();
		oc.slno=99;
		oc.name="Chaitanya";
		oc.salary=18;
		oc.Display();
		
		

		OopsClass_1 oc2=new OopsClass_1();
		oc.slno=22;
		oc.name="rdx";
		oc.salary=22;
		oc.Display();
		
		
		
		

	}

}
