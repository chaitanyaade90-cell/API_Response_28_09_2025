package new_conceptProperties_07_10_2025;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
			
			//file path
			File f=new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\resources\\SYS.properties");
			FileInputStream fis=new FileInputStream(f);
			Properties prop=new Properties();
			//load file
			prop.load(fis);
			
			//print values
			System.out.println(prop.get("endpoing1_api_url"));
			
			System.out.println(prop.get("firstname"));
			
			
		}

	}


