package Package_03_05_2026;

import java.util.HashMap;

public class Complex_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> student = new HashMap<>();
		
		student.put(9, "Ram");
		student.put(11, "Ajit");
		student.put(12, "John");
		
		for(Integer id : student.keySet()) {
			
			System.out.println(" ID:" + id + " Name : " + student.get(id));
		}
		
		

	}

}
