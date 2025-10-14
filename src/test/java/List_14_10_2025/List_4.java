package List_14_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("ATR");
		names.add("API");
		names.add("ATR Service");
		names.add("Bruno");
		
		for (int i = 0; i < names.size(); i++) {
			
			//System.out.println("names starting with 'A' : ");
			
			String name=names.get(i);
			
			if(name.startsWith("A")) {
				System.out.println(name);
			}
			
			
		}

	}

}
