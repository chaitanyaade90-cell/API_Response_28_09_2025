
public class Static2 {
	
	static int num;
	static String name;
	static int salary;
	
	static public void WBT() {
		System.out.println("My num is " + num);
	}
	
	static public void BBT() {
		System.out.println("My name is " + name);
	}
	static public void GBT() {
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.num=22;
		Static2.name="Axis";
		Static2.salary=80000;
		
		Static2.WBT();
		Static2.BBT();
		Static2.GBT();

	}

}
