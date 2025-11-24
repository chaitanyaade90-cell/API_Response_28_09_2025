package List_24_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Tv");
		names.add("Toys");
		names.add("TVS");
		
		System.out.println("Names starting with 'T' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("T")) {
				System.out.println(name);
			}
			
		}

	}

}
