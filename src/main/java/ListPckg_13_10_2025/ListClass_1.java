package ListPckg_13_10_2025;

import java.util.ArrayList;
import java.util.List;

public class ListClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Amit");
		names.add("Ajit");
		names.add("Amol");
		names.add("Naresh");
		names.add("Sameer");
		names.add("Steve");
		
		
		
		for (int i = 0; i < names.size(); i++) {
			
			//System.out.println("Names start with 'A':");
			
			String name=names.get(i);
			
			if(name.startsWith("A")) {
				System.out.println(name);
			}
			
		}
		
		

	}

}
