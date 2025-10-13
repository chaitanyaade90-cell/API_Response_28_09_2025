package ListPckg_13_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Bob");
		names.add("Brave");
		names.add("Bracewell");
		names.add("Alex");
		names.add("Ajol");
		
		for (int i = 0; i < names.size(); i++) {
			
			
			
			// System.out.println("Names Starting with 'B' :");
			
			String name=names.get(i);
			
			if(name.startsWith("B")) {
			System.out.println(name);
				
			}
			
			
			
			
			
		}

	}

}
