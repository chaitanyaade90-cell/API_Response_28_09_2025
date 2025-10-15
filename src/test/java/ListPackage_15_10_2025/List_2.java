package ListPackage_15_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Raj");
		names.add("Rakesh");
		names.add("Robin");
		names.add("Axel");
		
		for (int i = 0; i < names.size(); i++) {
			
			// System.out.println("Names staring with 'R' : ");
			
			String name=names.get(i);
			
			if(name.startsWith("I")) {
				
				System.out.println(name);
			}
			
			
			
		}

	}

}
