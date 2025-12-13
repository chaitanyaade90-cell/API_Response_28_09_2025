package ListPckg_13_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_3 {

	private static char[] name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Toyota");
		names.add("Tata");
		names.add("Thunder");
		names.add("Tavera");
		names.add("Audi");
		names.add("Apache");
		
		for (int i = 0; i < names.size(); i++) {
			
			// String name("cars starting with 'T' : ");
			
			String name=names.get(i);
			
			if(name.startsWith("T"))
			
			System.out.println(name);
			
		}

	}

}
