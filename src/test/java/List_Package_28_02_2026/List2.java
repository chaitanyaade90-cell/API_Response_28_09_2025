package List_Package_28_02_2026;

import java.util.ArrayList;
import java.util.Iterator;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList();
		
		names.add("Sanity");
		names.add("Severity");
		names.add("Smoke");
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
