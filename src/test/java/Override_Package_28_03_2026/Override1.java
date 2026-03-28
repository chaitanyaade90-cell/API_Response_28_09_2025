package Override_Package_28_03_2026;

class Lenovo
{
	
	public void show() {
		
		System.out.println("Lenovo is Laptop Company");
	}

	public void Search() {
		// TODO Auto-generated method stub
		
	}
}

class Whirlpool extends Lenovo{
	
	@Override
	
	public void Search() {
		
		System.out.println("Whirlpool is AC company");
	}
}

public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Whirlpool w1 = new Whirlpool();
		
		w1.show();
		w1.Search();

	}

}
