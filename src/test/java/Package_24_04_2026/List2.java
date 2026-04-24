package Package_24_04_2026;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Java");
		names.add("Jarfile");
		names.add("JavaScript");
		
		System.out.println("Names starting with 'J'");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("J")) {
				System.out.println(name);
			}
			
			
		}

	}

}
