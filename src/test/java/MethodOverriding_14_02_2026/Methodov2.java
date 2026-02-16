package MethodOverriding_14_02_2026;

class computer
{
	
	int add(int a, int b) {
		return a+b;
		
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
				
	}
}

public class Methodov2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		computer c1 = new computer();
		
		System.out.println(c1.add(1000, 2000));
		System.out.println(c1.add(3000, 4000, 5000));
		
		

	}

}
