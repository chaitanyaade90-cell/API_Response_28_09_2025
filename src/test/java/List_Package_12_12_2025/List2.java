package List_Package_12_12_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("AzureDevops");
		names.add("Accell");
		names.add("Axis");
		names.add("Web");
		
		System.out.println("Names starting with 'A' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("A")) {
				System.out.println(name);
			}
			
			
		}

	}

}
