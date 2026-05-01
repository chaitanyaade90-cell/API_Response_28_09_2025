package Package_01_05_2026;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList();
		
		names.add("Add");
		names.add("Abstract");
		names.add("Addition");
		
		System.out.println("Name starting with 'A'");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("A")) {
				
				System.out.println(name);
			}
			
		}

	}

}
