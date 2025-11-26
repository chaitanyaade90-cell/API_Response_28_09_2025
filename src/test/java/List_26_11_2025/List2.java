package List_26_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Icici");
		names.add("Insurance");
		names.add("Industry");
		names.add("ultra");
		
		System.out.println("Names starting with 'I'");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("I")) {
				System.out.println(name);
			}
			
			
		}

	}

}
