package Package_03_05_2026;

class Animal
{
	public void Animal() {
		
		System.out.println("Animal makes sound");
	}

	public void sound() {
		// TODO Auto-generated method stub
		
	}
}

class Dog extends Animal{
	
	@Override
	
	public void sound(){
		
		System.out.println("Dog Parks");
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		d.Animal();
		d.sound();

	}

}
