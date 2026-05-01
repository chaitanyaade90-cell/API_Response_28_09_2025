package Package_01_05_2026;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Bike");
		names.add("Bycycle");
		names.add("Brave");
		
		System.out.println("Names starting with 'B' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("B")) {
				System.out.println(name);
			}
			
			
		}

	}

}
