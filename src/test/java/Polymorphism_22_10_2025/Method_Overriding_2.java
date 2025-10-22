package Polymorphism_22_10_2025;

class Cars
{
	
	void Sound() {
		
		System.out.println("Cars makes a sound");
	}
	
	}

class Engine extends Cars
{
	void Sound() {
		
		System.out.println("Engine Blow");
		
		
	}
}

class Horn extends Engine
{
	void Sound() {
		
		System.out.println("Horn blows");
	}
	
	
}



public class Method_Overriding_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a;
		
		a=new Dog();
		a.Sound(); // output Dog Barks
		
		a=new Cat();
		a.Sound();

	}

}
