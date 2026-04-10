package List_10_04_2026;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Onboarding");
		names.add("OOps");
		names.add("smoke");
		
		System.out.println("Names starting with 'O'");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("O")) {
				System.out.println(name);
			}
			
		}

	}

}
