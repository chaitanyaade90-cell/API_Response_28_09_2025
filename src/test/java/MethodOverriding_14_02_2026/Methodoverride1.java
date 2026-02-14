package MethodOverriding_14_02_2026;

class calculator{
	
	int add (int a, int b) {
		return a+b;
		
		
	}


int add (int a, int b, int c) {
	return a+b+c;
	
	
}
	
}

public class Methodoverride1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculator obj = new calculator();
		
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
		

	}

}
