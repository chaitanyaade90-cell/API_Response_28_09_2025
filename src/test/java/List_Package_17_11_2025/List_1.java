package List_Package_17_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Rapidex");
		names.add("Radison");
		names.add("Realme");
		names.add("Publication");
		
		System.out.println("Names starting with 'R' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("R")) {
				System.out.println(name);
			}
			
			
		}

	}

}
