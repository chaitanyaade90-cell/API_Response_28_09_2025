package Inheritance_28_02_2026;

class Access
{
	
	public void ADO() {
		
		System.out.println("My Project is ATR");
	}
}

class Database extends Access{
	
	public void BDD() {
		
		System.out.println("My Role is QE");
	}
}

public class Instance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Database db = new Database();
		
		db.ADO();
		db.BDD();

	}

}
