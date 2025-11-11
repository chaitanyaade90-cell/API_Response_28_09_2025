package List_11_11_2025_1;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Cheque");
		names.add("Cross");
		names.add("Create");
		names.add("API");
		
		System.out.println("Names starting with 'C' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("C")) {
				System.out.println(name);
			}
			
			
			
		}

	}

}
