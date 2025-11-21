package List_21_11_2025;

import java.util.ArrayList;
import java.util.List;

public class ListClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("System");
		names.add("Software");
		names.add("SQl");
		names.add("VScode");
		
		System.out.println("Names starting with 'S' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("S")) {
				System.out.println(name);
			}
			
		}
		

	}

}
