package MethodArgument_15_11_2025;

public class Method1 {
	
	public static void Add(int a1, int a2) {
		int sum=a1+a2;
		System.out.println(sum);
	}
	
	public static void sum(int a3, int a4) {
		int sum=a3-a4;
		System.out.println(sum);
	}
	
	public static void mul(int a5, int a6) {
		int sum=a5*a6;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method1 m1=new Method1();
		m1.Add(2000, 1000);
		m1.sum(4000, 2000);
		m1.mul(3000, 2000);
		
		

	}

}
