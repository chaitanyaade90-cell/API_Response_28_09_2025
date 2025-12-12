package MethodA_12_12_2025;

import java.lang.reflect.Method;

public class Method2 {
	
	public static void add(int b1, int b2) {
		int sum=b1+b2;
		System.out.println(sum);
	}
	public static void sub(int b4, int b5) {
		int sum=b4-b5;
		System.out.println(sum);
	}
	public static void mul(int b6, int b7) {
		int sum=b6*b7;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method2.add(2000, 3000);
		Method2.sub(1000, 500);
		Method2.mul(200, 300);

	}

}
