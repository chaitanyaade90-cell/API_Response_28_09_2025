package ArrayList_19_04_2026;

import java.util.ArrayList;

public class ArrayClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Software");
		names.add("Smoke");
		names.add("Severity");
		names.add("regression");
		
		System.out.println("Names starting with 'S'");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("S")) {
				System.out.println(name);
			}
			
		}

	}

}
