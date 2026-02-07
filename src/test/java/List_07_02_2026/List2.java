package List_07_02_2026;

import java.util.ArrayList;

public class List2 {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Sanity");
		names.add("Software");
		names.add("Smoke");
		names.add("Regression");
		
		System.out.println("Names starting with 'S' ");
		
		for (int i = 0; i < names.size(); i++) {
			
		}
			String name = names.get(i);
			
			if(name.startsWith("S")) {
				System.out.println(name);
			}
			
			
			
		

	}

}
