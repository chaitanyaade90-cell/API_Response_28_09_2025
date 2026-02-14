package MultilevelInheritance_14_02_2026;

class GrandParent
{
	
	public void property() {
		
		System.out.println("Grand property");
	}
}

class Parent {
	
	}

class Child extends Parent{
	
	public void Estate() {
		
		System.out.println("My property is 100 crore");
	}
	
}



public class Multilevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child cd1 = new Child();
		
		cd1.Estate();
		

	}

}
