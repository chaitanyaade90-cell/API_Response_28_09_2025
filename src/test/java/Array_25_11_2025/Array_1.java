package Array_25_11_2025;

import java.util.ArrayList;
import java.util.List;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>names=new ArrayList<>();
		
		names.add("Achiever");
		names.add("Acquire");
		names.add("Axis");
		
		System.out.println("Names starting with 'A' :");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("A")) {
				System.out.println(name);
			}
			
			
			
		}

	}

}
