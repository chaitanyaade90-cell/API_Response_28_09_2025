package ListPackage_21_10_2025;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource;

public class ListClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names= new ArrayList<>();
		
		names.add("Usa");
		names.add("US");
		names.add("Umenia");
		names.add("England");
		
		System.out.println("Names starting with U : ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name=names.get(i);
			
			if(name.startsWith("U")) {
				
				System.out.println(name);
			}
			
		}

	}

}
