package PropPckg_13_10_2025;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import new_concept_properties.properties;

public class Properties_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//File Path
		
		File F=new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\resources\\SYS.properties");
        
		FileInputStream fis=new FileInputStream(F);
		
		properties prop=new properties();
	}

}
