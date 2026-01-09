package List_09_01_2026;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		
		names.add("Regression");
		names.add("Remote");
		names.add("Register");
		
		System.out.println("Names starting with 'R'");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
	
			if(name.startsWith("R")) {
				System.out.println(name);
			}
		}

	}

}
