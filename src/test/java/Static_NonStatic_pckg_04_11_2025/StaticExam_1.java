package Static_NonStatic_pckg_04_11_2025;

public class StaticExam_1 {
	
	// Non static exmp
	
	int A=10;
	void M1() {
		
		System.out.println(A);
	}
	
	// Static Examples
	
	static int b=20;
	static void m2() 
	{
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticExam_1 SE=new StaticExam_1();
		SE.M1();
		
		m2();

	}

}
