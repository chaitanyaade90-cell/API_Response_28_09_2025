package Inheritance_01_11_2025;



public class Dog extends Animal {
	
	public void Bark() {
		
		System.out.println("Bark");
		
	}
	
	public static void main(String[] args) {
		
		Dog dg=new Dog();
		dg.Bark();
		dg.eat();
		
		
		Animal an=new Animal();
		an.eat();
		
		
		
	}

}
