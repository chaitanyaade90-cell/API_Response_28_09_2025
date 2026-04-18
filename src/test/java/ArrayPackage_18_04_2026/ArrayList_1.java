package ArrayPackage_18_04_2026;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Severity");
		names.add("Software");
		names.add("Smoke");
		
		System.out.println("Names srating with 'S' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("S")) {
				System.out.println(name);
			}
			
		}

	}

}
