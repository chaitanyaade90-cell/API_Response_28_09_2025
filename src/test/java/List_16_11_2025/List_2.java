package List_16_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names=new ArrayList<>();
		names.add("Icici");
		names.add("Ifel");
		names.add("Intel");
		names.add("Flipksrt");
		
		System.out.println("Names staring with 'I' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("I")) {
				System.out.println(name);
			}
			
		}

	}

}
