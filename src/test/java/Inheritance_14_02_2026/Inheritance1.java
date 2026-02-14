package Inheritance_14_02_2026;

class Animal
{
	public void sound() {
		
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{
	
	public void bark() {
		
		System.out.println("Dog Barks");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj = new Dog();
		
		obj.sound();
		obj.bark();

	}

}
