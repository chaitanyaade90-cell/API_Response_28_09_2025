package new_conceptProperties_07_10_2025;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import new_concept_properties.properties;

public class properties_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		// File Path
		
		File f=new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\resources\\SYS.properties");
        
		FileInputStream fis1=new FileInputStream(f);
		
		properties_2 prop=new properties_2();
		
		//load files
		
		prop.load(fis1);
		
		//print values
		
		System.out.println(prop.get("endpoing1_api_url"));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

	private char[] get(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private void load(FileInputStream fis1) {
		// TODO Auto-generated method stub
		
	}

}
