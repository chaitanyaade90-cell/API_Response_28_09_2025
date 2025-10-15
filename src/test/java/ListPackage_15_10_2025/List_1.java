package ListPackage_15_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("India");
		names.add("Indiana");
		names.add("Indo");
		names.add("Europe");
		names.add("Germany");
		
		for (int i = 0; i < names.size(); i++) {
			
			// System.out.println("Names starting with 'I' : ");
			
			String name=names.get(i);
			
			if(name.startsWith("I")) {
				
				System.out.println(name);
				
			}
			
			
			
		}
		
		
	}

}
