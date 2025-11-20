package List_20_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Regression");
		names.add("Ranger");
		names.add("Roadmap");
		names.add("Sanity");
		
		System.out.println("Names statring with 'R' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name= names.get(i);
			
			if(name.startsWith("R")) {
				System.out.println(name);
			}
			
		}

	}

}
