package List_Package_12_12_2025;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names=new ArrayList<>();
		
		names.add("Wipro");
		names.add("Wolkwagon");
		names.add("Whirlpool");
		
		System.out.println("Names starting with 'W' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("W")) {
				System.out.println(name);
			}
			
			
		}

	}

}
