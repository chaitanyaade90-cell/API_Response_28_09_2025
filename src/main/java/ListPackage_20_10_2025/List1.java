package ListPackage_20_10_2025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> names= new ArrayList<>();	
		
			names.add("India");
			names.add("Indiana");
			names.add("Indo");
			names.add("Europe");
			
			System.out.println("Names starting with 'I' : ");
			
			for (int i = 0; i < names.size(); i++) {
				
				String name=names.get(i);
				
				if(name.startsWith("I")) {
					
					System.out.println(name);
				}
			}
				
			
				
			}

	}


