package Package_24_04_2026;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Runtest");
		names.add("Regression");
		names.add("Result");
		names.add("Smoke");
		
		System.out.println("Names starting with 'R' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("R")){
				System.out.println(name);
			}
			
		}

	}

}
