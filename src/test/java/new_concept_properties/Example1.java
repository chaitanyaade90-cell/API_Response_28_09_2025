package new_concept_properties;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class Example1 {

	public static void main(String[] args) throws Exception {
		
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
