package List_Package_23_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Apple");
		names.add("Adam");
		names.add("Aish");
		names.add("Ball");
		
		for (int i = 0; i < names.size(); i++) {
			
			System.out.println("Names starting with 'A' : ");
			
			String name=names.get(i);
			
			if(name.startsWith("A")) {
				
				System.out.println(name);
			}
			
		}
	}

}
