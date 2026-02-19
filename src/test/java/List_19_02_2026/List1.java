package List_19_02_2026;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("NetService");
		names.add("NFR");
		names.add("NFRTesting");
		names.add("Regression");
		
		System.out.println("Names starting with 'N' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("N")) {
				System.out.println(name);
			}
			
		}

	}

}
