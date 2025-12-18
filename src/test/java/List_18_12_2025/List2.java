package List_18_12_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("TataMotors");
		names.add("Telco");
		names.add("Techno");
		names.add("Azure");
		
		System.out.println("Names starting with 'T' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("T")) {
				System.out.println(name);
			}
			
		}

	}

}
