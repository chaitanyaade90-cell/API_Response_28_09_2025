package List_14_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Bat");
		names.add("Ball");
		names.add("Bowled");
		names.add("out");
		
		for (int i = 0; i < names.size(); i++) {
			
			//System.out.println("Names starting with 'B' :");
			
			String name=names.get(i);
			
			if(name.startsWith("B")) {
				
				System.out.println(name);
			}
			
		}

	}

}
