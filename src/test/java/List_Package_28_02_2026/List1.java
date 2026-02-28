package List_Package_28_02_2026;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList();
		
		names.add("Access");
		names.add("ADO");
		names.add("Azure");
		
		System.out.println("Names starting with 'A' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("A")) {
				System.out.println(name);
			}
			
		}

	}

}
