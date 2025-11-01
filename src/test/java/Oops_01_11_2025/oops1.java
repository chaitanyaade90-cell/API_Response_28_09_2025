package Oops_01_11_2025;

import Oops_25_10_2025.Oops1;

public class oops1 {
	
	int id;
	String name;
	String salary;
	
	public void display() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		oops1 op=new oops1();
		op.id=22;
		op.name="Chaitanya";
		op.salary="20000";
		op.display();
		

	}

}
