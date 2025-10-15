package ListPackage_15_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> names=new ArrayList<>();
		
		names.add("Samsung");
		names.add("SUzuki");
		names.add("Suzol");
		names.add("Axis");
		
		for (int i = 0; i < names.size(); i++) {
			
			// System.out.println("Names starting with 'S' : ");
			
			String name=names.get(i);
			
			if(name.startsWith("S")) {
				System.out.println(name);
			}
			
		}
		

	}

}
