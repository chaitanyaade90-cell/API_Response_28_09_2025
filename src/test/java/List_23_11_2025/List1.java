package List_23_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("India");
		names.add("Indoneshia");
		names.add("Indiana");
		names.add("Australia");
		
		System.out.println("Names starting with 'I' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("I")) {
				System.out.println(name);
			}
			
			
			
		}

	}

}
