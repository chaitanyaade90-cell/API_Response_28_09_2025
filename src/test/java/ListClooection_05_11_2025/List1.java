package ListClooection_05_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("LG");
		names.add("Liverpool");
		names.add("Livestrong");
		names.add("Saviour");
		
		System.out.println("Names starting with 'L' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("L")) {
				
			}
			System.out.println(name);
			
		}

	}

}
