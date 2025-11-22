package List_22_11_2025;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<>();
		names.add("WIpro");
		names.add("Wokswagon");
		names.add("Wallet");
		names.add("Axa");
		
		System.out.println("Names starting 'W' :");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("W")) {
				System.out.println(name);
			}
			
			
			
		}
				

	}

}
