package Inheritance_01_11_2025;

class Animal
{
	int dog;
	
	public void Bark() {
		
	}
	
}

class Bark extends Animal
{
	
	int cat;
	
	public void meow() {
		
		
	}
}

public class Inheri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal an=new Animal();
		an.Bark();
		
		
		
		Bark ba=new Bark();
		ba.meow();

	}

}
