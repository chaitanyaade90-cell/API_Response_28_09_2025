package MethodArgument_16_11_2025;

public class Method2 {
	
	public static void add (int B1, int B2) {
		int sum= B1+B2;
		System.out.println(sum);
	}
	
	public static void sum(int B3, int B4) {
		int sum=B3-B4;
		System.out.println(sum);
	}
	
	public static void mul(int B5, int B6) {
		int sum=B5*B6;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method2.add(1000, 2000);
		Method2.sum(300, 200);
		Method2.mul(400, 200);

	}

}
