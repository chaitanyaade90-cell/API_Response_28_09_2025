package ListPckg_04_11_2025;

import java.util.ArrayList;
import java.util.List;

public class NamesList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names= new ArrayList<>();
		
		names.add("Steve");
		names.add("Slaver");
		names.add("Steal");
		names.add("Jones");
		
		System.out.println("Names starting with 'S' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("S")) {
				System.out.println(names);
			}
			
		}

	}

}
