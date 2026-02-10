package List_10_02_2026;

import java.util.ArrayList;


public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("SearchResult");
		names.add("Software");
		names.add("SyncApp");
		names.add("Regression");
		
		System.out.println("Names starting with 'S' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("S")) {
				System.out.println(name);
			}
			
		}
				

	}

}
