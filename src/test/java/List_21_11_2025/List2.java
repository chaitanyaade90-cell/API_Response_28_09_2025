package List_21_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Excel");
		names.add("Expert");
		names.add("Experiance");
		names.add("axa");
		
		System.out.println("Names starting with 'E' :");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("E")) {
				System.out.println(name);
			}
			
			
			
		}
		
		
				

	}

}
