package List_13_12_2025;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Pune");
		names.add("Panji");
		names.add("Phuket");
		
		System.out.println("Names starting with 'P' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("P")) {
				System.out.println(name);
			}
			
		}
		
	}

}
