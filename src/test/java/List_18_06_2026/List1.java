package List_18_06_2026;

import java.util.ArrayList;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Regression");
		names.add("Rapid");
		names.add("Role");
		
		System.out.println("Names starting with 'R' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("R")) {
				System.out.println(name);
			}
			
		}

	}

}
