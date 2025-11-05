package ListClooection_05_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Lenova");
		names.add("Lavender");
		names.add("Loan");
		names.add("Barrier");
		
		System.out.println("Names starting with 'L' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("L")) {
				System.out.println(name);
			}
			
		}

	}

}
