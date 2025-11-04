package ListPckg_04_11_2025;

import java.util.ArrayList;
import java.util.List;

public class ListNames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList();
		
		names.add("Class1");
		names.add("Class2");
		names.add("Class3");
		names.add("Stad1");
		
		System.out.println("Names starting with 'C' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("C")) {
				
				System.out.println(name);
			}
			
			
			
		}

	}

}
