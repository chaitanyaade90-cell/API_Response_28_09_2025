package List_11_11_2025;

import java.util.ArrayList;
import java.util.List;

public class ListClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("API");
		names.add("AZURE");
		names.add("ACCEL");
		names.add("BIO");
		
		System.out.println("Names starting with 'A' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("A")) {
				System.out.println(name);
			}
			
		}

	}

}
