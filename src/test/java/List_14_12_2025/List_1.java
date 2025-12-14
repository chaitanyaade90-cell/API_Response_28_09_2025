package List_14_12_2025;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("SQL");
		names.add("Software");
		names.add("SQM");
		names.add("Accell");
		
		System.out.println("Names starting with 'S' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("S")) {
				System.out.println(name);
			}
			
			
		}

	}

}
