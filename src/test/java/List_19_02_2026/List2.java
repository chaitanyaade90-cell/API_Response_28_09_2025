package List_19_02_2026;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Test");
		names.add("Testing");
		names.add("Tester");
		names.add("Software");
		
		System.out.println("Names starting with 'T'");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("T"));
			System.out.println(name);
			
		}

	}

}
