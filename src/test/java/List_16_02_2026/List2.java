package List_16_02_2026;

import java.util.ArrayList;

public class List2 {
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 ArrayList<String> names = new ArrayList<>();
	 
	 names.add("Int");
	 names.add("Index");
	 names.add("India");
	 
	 System.out.println("Names starting with 'I' ");
	 
	 for (int i = 0; i < names.size(); i++) {
		 
		 String name = names.get(i);
		 
		 if(name.startsWith("I")) {
			 System.out.println(name);
		 }
		 
		
	}

	}

}
