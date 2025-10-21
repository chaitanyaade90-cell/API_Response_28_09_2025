package ListPackage_21_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> cities=new ArrayList<>();
		
		cities.add("Chennai");
		cities.add("Coibmtore");
		cities.add("Chitoor");
		cities.add("Mumbai");
		
		System.out.println("Citi names starting with C : ");
		
		for (int i = 0; i < cities.size(); i++) {
			
			String citi=cities.get(i);
			
			if(citi.startsWith("C")) {
				
				System.out.println(citi);
			}
			
		}

	}

}
