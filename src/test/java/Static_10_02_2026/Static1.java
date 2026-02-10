package Static_10_02_2026;

public class Static1 {
	
	static int id;
	static String name;
	static int salary;
	
	public static void NFR() {
		
		System.out.println("My id is + id");
	}
	
	public static void Corerefrence() {
		
		System.out.println("My name is " + name);
	}
	
	public static void SyncApp() {
		
		System.out.println("My salary is + salary");
	}
	
	public static void SearchResult() {
		
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1 s1 = new Static1();
		
		s1.id=11;
		s1.name="BBT";
		s1.salary=90000;
		
		s1.Corerefrence();
		s1.SyncApp();
		s1.SearchResult();
		
		

	}

}
