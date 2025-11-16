package List_16_11_2025;

import java.util.ArrayList;
import java.util.List;

public class ListClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		names.add("Wipro");
		names.add("Wolks");
		names.add("Woksawagon");
		names.add("Nexon");
		
		System.out.println("Names staring with 'W' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("W")) {
				System.out.println(name);
			}
		}

	}

}
