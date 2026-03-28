package MethodOverloading_28_03_2026;

class Testing
{
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
}

class SoftwareDevelope extends Testing {
	
	public void add (int a, int b, int c) {
		
		
		
		System.out.println(a+b+c);
	}
}

public class Ovvriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoftwareDevelope s1 = new SoftwareDevelope();
		
		s1.add(200,300);
		s1.add(200, 300, 400);
		

	}

}
