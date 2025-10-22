package Polymorphism_22_10_2025;

class Animal
{
	
	void sound() {
		
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal
{
	
	void sound () {   // overriding parent method
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal
{
	void sound () {
		
		System.out.println("Cat meows");
	}
	
}

public class Method_OverRiding_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a;
		a=new Dog();
		
		a.sound(); // Output Dog Barks
		
		a=new Cat();
		a.sound();

	}

}
