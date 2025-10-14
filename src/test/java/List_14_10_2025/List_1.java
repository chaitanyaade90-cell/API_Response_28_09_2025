package List_14_10_2025;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Name;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Lg");
		names.add("Larsen");
		names.add("L&T");
		names.add("Apple");
		names.add("Alex");
		
		for (int i = 0; i < names.size(); i++) {
			
			//System.out.println("names starting with 'T' :");
			
			String name=names.get(i);
			
			if(name.startsWith("T")) {
				
				System.out.println(names);
			}
			
	
			
		}

	}

}
