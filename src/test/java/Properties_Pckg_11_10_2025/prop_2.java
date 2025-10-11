package Properties_Pckg_11_10_2025;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class prop_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// File Path
		
		File f=new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\resources\\SYS.properties");
        
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		
		// File load
		
		prop.load(fis);
		
		System.out.println("endpoing1_api_url");
	}

}
