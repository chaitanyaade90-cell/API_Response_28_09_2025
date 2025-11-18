package List_18_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("AIP");
		names.add("Accel");
		names.add("Axis");
		names.add("Baray");
		
		System.out.println("Names starting with 'A' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("A")) {
				System.out.println(name);
			}
			
			
		}

	}

}
