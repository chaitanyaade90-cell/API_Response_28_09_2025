package ListPackage_02_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Chennai");
		names.add("Coimbtore");
		names.add("Chandigadh");
		
		System.out.println("Names starting with 'C' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("C"));
			System.out.println(name);
			
			
		}
		
		
		
			
		}

	}


