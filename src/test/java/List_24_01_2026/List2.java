package List_24_01_2026;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		
		names.add("TestCase");
		names.add("TestScriprt");
		names.add("TestScenario");
		
		System.out.println("names starting with 'T' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("T")) {
				System.out.println(name);
			}
			
		}

	}

}
