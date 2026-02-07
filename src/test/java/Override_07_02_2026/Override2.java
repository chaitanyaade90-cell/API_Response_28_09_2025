package Override_07_02_2026;

class students
{
	public void students() {
		
		System.out.println("All students are science backgrounds");
	}
	
	public void liabrary() {
		
		
	}
}

class books extends students{
	
	@Override
	
	public void liabrary() {
		
		System.out.println("All students are eligilae for scholarship");
		
		
	}
}



public class Override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		books bk = new books();
		
		bk.students();
		bk.liabrary();

	}

}
