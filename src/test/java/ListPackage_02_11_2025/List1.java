package ListPackage_02_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Mercedez");
		names.add("Matiz");
		names.add("Max");
		names.add("Lavender");
		
		System.out.println("Names starting with 'M' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("M")) {
				System.out.println(name);
			}
			
		}

	}

}
