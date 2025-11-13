package ListPackage_1;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Future Tense");
		names.add("Future past");
		names.add("Future continue");
		names.add("Past Tense");
		
		System.out.println("Names starting with 'F' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("F")) {
				System.out.println(name);
			}
			
		}

	}

}
