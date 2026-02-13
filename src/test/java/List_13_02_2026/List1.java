package List_13_02_2026;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("WaterFallModel");
		names.add("Writer");
		names.add("WEBAutomation");
		
		System.out.println("Names starting with 'W' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("W")) {
				System.out.println(name);
			}
			
		}

	}

}
