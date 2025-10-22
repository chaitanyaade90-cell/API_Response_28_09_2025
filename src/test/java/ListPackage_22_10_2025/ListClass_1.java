package ListPackage_22_10_2025;

import java.util.ArrayList;
import java.util.List;

public class ListClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Class");
		names.add("Chairs");
		names.add("Chain");
		names.add("Button");
		
		for (int i = 0; i < names.size(); i++) {
			
			System.out.println("Names starting with 'C' ");
			
			String name=names.get(i);
			
			if(name.startsWith("C")) {
				
				System.out.println(name);
			}
			
		}

	}

}
