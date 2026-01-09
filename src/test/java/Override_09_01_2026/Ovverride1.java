package Override_09_01_2026;

class Students{
	
	public void Subjects() {
		
		System.out.println("All Students are Science Background");
	}

	public void Liabrary() {
		// TODO Auto-generated method stub
		
	}
}

class Books extends Students{
	
	@Override
	
	public void Liabrary() {
		
		System.out.println("All Students Applicable for Scholarship");
		
	}
		
	}


public class Ovverride1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Books bk = new Books();
		
		bk.Subjects();
		bk.Liabrary();

	}

}
