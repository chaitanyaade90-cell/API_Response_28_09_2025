package List_24_01_2026;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names= new ArrayList<>();
		
		names.add("Tata");
		names.add("Telecom");
		names.add("Telecast");
		names.add("Logic");
		
		System.out.println("Names starting with 'T' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("T")) {
				System.out.println(name);
			}
				
			}
			
		}

	}


