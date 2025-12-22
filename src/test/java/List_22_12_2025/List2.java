package List_22_12_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Manual");
		names.add("Manafacture");
		names.add("String");
		
		System.out.println("Names starting with 'M' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("M")) {
				System.out.println(name);
			}
			
		}

	}

}
