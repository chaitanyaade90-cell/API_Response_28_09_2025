package MethodArgument_05_11_2025;

public class Method2 {
	
	public static void add (int b1, int b2) {
		int sum=b1+b2;
		System.out.println(sum);
		
	}
	public static void sum(int b3, int b4) {
		int sum=b3-b4;
		System.out.println(sum);
		
	}
	public static void mul(int b5, int b6) {
		int sum=b5*b6;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub30
		
		Method2 m2=new Method2();
		m2.add(500, 300);
		m2.sum(900, 800);
		m2.mul(900, 200);

	}

}
