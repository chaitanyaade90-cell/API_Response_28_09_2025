package Properties_12_11_2025;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\resources\\SYS.properties");
        
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.get("endpoing1_api_url"));
	}

}
