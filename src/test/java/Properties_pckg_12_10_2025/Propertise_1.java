package Properties_pckg_12_10_2025;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertise_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// File Path
		
		File f=new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\resources\\SYS.properties");
        
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		
		//File load
		
		prop.load(fis);
		
		System.out.println(prop.get("endpoing1_api_url"));
	}

}
