package List_Package_17_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		
		names.add("Vertex");
		names.add("Veritos");
		names.add("Vanish");
		names.add("Reliance");
		
		System.out.println("Names starting with 'V' : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("V")) {
				System.out.println(name);
			}
			
		}

	}

}
