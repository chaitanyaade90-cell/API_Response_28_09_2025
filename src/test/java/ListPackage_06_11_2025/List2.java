package ListPackage_06_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("ATR");
		names.add("API");
		names.add("Azure");
		names.add("SQM");
		
		System.out.println("Names starting with 'A' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("A")) {
				System.out.println(name);
			}
			
			
		}

	}

}
