package ListPackage_20_10_2025;

import java.util.ArrayList;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Asia");
		names.add("Africa");
		names.add("Australia");
		names.add("Europe");
		names.add("England");
		
		System.out.println("Names statrting with 'A'");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("A")) {
				System.out.println(name);
			}
			
		}

	}

}
