package List_21_12_2025;

import java.util.ArrayList;
import java.util.List;

public class Lis1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Carons");
		names.add("Chevrolet");
		names.add("Contra");
		
		System.out.println("Names starting with 'C' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("C")) {
				System.out.println(name);
			}
			
		}

	}

}
