package ListPackage_25_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("China");
		names.add("Chol");
		names.add("Cambodia");
		names.add("Burmuda");
		
		for (int i = 0; i < names.size(); i++) {
			
			System.out.println("Names starting with 'C' ");
			
			String name=names.get(i);
			
			if(name.startsWith(name, 'C'));
			
			System.out.println(name);
		}

	}

}
