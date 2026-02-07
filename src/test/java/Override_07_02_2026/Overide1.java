package Override_07_02_2026;

import com.google.errorprone.annotations.ForOverride;

class Animal{
	
	void sound() {
		
		System.out.println("Animal takes a sound");
	}

}

class Dog extends Animal{
	
	@ForOverride
	
	void sound () {
		
		System.out.println("Dog barks");
	}
}

public class Overide1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Dog();
		a.sound();

	}

}
