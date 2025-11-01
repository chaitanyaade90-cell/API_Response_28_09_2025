package List_01_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("NorthornTrust");
		names.add("NiftyFifty");
		names.add("Nesdac");
		names.add("Average");
		
		System.out.println("Names starting with 'N' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("N")) {
				System.out.println(name);
			}
			
		}

	}

}
