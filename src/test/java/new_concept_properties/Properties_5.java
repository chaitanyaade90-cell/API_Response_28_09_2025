package new_concept_properties;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class Properties_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//file path
		
		File f=new File("C:\\ChaitanyaAde\\eclipse_workspace\\API_Response_28_09_2025\\src\\test\\resources\\SYS.properties");
        FileInputStream fis=new FileInputStream(f);
        
        Properties prop=new Properties();
        
        //load files
        prop.load(fis);
        
        //Print Values
        
        System.out.println(prop.getProperty("end pointurl_api_url"));
        
        
	}

}
